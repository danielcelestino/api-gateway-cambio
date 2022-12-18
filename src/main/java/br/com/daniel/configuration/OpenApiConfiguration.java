package br.com.daniel.configuration;

//@Configuration
public class OpenApiConfiguration {
	
//	@Bean
//	public List<GroupedOpenApi> apis(SwaggerUiConfigParameters config, 
//	 RouteDefinitionLocator locator) {
//		
//		var definitions = locator.getRouteDefinitions().collectList().block();
//		definitions.stream().filter(
//				routeDefinition -> routeDefinition.getId()
//					.matches(".*-services"))
//						.forEach(routeDefinition -> {
//							String name = routeDefinition.getId();
//							config.addGroup(name);
//							GroupedOpenApi.builder().pathsToMatch("/" + name + "/**").group(name).build();
//						});
//		return new ArrayList<>();
//	}

}
