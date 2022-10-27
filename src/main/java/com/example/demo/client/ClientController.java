package com.example.demo.client;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(path = "api/v1/client")
public class ClientController {
    
	private final ClientService clientService;

	@Autowired
	public ClientController(ClientService clientService) {
		this.clientService = clientService;
	}

	@PostMapping
	public void registerNewClient(@RequestBody Client client) {
		clientService.addNewClient(client)
	}

	@GetMapping
	public List<ClientModel> getClients() {
		return clientService.getClients();
	}

	@PutMapping(path = "{clientId}")
	public void updateClient(
							@PathVariable("clientId") Long clientId,
							@RequestParam(required = false) String name,
							@RequestParam(required = false) String email) {
		clientService.updateClient(clientId, name, email);
	}

	@DeleteMapping(path = "{clientId}")
	public void deleteClient(@PathVariable("clientId") Long clientId) {
		clientService.deleteClient(clientId)
	}

}
