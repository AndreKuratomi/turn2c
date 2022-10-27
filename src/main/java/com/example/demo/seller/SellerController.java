package com.example.demo.seller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(path = "api/v1/seller")
public class SellerController {
    
	private final SellerService sellerService;

	@Autowired
	public SellerController(SellerService sellerService) {
		this.sellerService = sellerService;
	}

	@PostMapping
	public void registerNewSeller(@RequestBody seller seller) {
		sellerService.addNewSeller(seller)
	}

	@GetMapping
	public List<Seller> getSellers() {
		return sellerService.getSellers();
	}

	@PutMapping(path = "{sellerId}")
	public void updateSeller(
							@PathVariable("sellerId") Long sellerId,
							@RequestParam(required = false) String name,
							@RequestParam(required = false) String email) {
		sellerService.updateSeller(sellerId, name, email);
	}

	@DeleteMapping(path = "{sellerId}")
	public void deleteSeller(@PathVariable("sellerId") Long sellerId) {
		sellerService.deleteSeller(sellerId)
	}

}
