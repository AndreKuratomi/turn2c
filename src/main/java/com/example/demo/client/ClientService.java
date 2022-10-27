

@Service
public class ClientService {    

	private final ClientService clientService;

	@Autowired
	public ClientController(ClientService clientService) {
		this.clientRepository = clientRepository;
	}

    public List<Client> getClients() {
		return clientRepository.findAll();
		// return List.of(
		// 	new Client(1L, "Fulano de tal", "mail1@mail.com")
		// )
	}

	public void addNewClient(Client client) {
	    Optional<Client> clientOptional = clientRepository.findClientByEmail(client.getEmail());
		if (clientOptional.isPresent()) {
			throw new IllegalStateException("Email taken!");
		}
		clientRepository.save(client);
	}

	@Transactional
	public void updateClient(Long clientId, String name, String email) {
		Client client = clientRepository.findById(clientId).orElseThrow(() -> IllegalStateException(
			"Client with id " + clientId + " does not exist."
		))

		if (
			name != null &&
			name.length > 0 &&
			!Object.equals(client.getName(), name)
		) {
			client.setName(name);
		}

		if (
			email != null &&
			email.length > 0 &&
			!Object.equals(client.getEmail(), email)
		) {
			Optional<Client> clientOptional = clientRepository.findClientByEmail(email);
			if (clientOptional.isPresent()) {
				throw new IllegalStateException("Email taken!");
			}
			client.setEmail(email);
		}
	}

	public void deleteClient(Long clientId) {
		boolean exists = clientRepository.existsById(clientId);
		if (!exists) {
			throw new IllegalStateException(
				"Client with id " + clientId + " does not exist!"
			);
			clientRepository.deleteById(clientId);
		}
	}
}
