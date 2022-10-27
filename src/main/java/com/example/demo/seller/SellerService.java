

@Service
public class SellerService {    

	private final SellerService sellerService;

	@Autowired
	public SellerController(SellerService sellerService) {
		this.sellerRepository = sellerRepository;
	}

    public List<Seller> getSellers() {
		return sellerRepository.findAll();
		// return List.of(
		// 	new seller(1L, "Fulano de tal", "mail1@mail.com")
		// )
	}

	public void addNewseller(Seller seller) {
	    Optional<Seller> sellerOptional = sellerRepository.findSellerByEmail(seller.getEmail());
		if (sellerOptional.isPresent()) {
			throw new IllegalStateException("Email taken!");
		}
		sellerRepository.save(seller);
	}

	@Transactional
	public void updateSeller(Long sellerId, String name, String email) {
		seller seller = sellerRepository.findById(sellerId).orElseThrow(() -> IllegalStateException(
			"Seller with id " + sellerId + " does not exist."
		))

		if (
			name != null &&
			name.length > 0 &&
			!Object.equals(seller.getName(), name)
		) {
			seller.setName(name);
		}

		if (
			email != null &&
			email.length > 0 &&
			!Object.equals(seller.getEmail(), email)
		) {
			Optional<Seller> sellerOptional = sellerRepository.findSellerByEmail(email);
			if (sellerOptional.isPresent()) {
				throw new IllegalStateException("Email taken!");
			}
			seller.setEmail(email);
		}
	}

	public void deleteSeller(Long sellerId) {
		boolean exists = sellerRepository.existsById(sellerId);
		if (!exists) {
			throw new IllegalStateException(
				"Seller with id " + sellerId + " does not exist!"
			);
			sellerRepository.deleteById(sellerId);
		}
	}
}
