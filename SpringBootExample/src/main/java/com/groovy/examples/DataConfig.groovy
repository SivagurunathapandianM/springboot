@Grab('h2')
@Configuration
@EnableWebMvc
@ComponentScan('bael.data')
class DataConfig {

    @Bean
    DataSource dataSource() {
        return new EmbeddedDatabaseBuilder()
          .setType(EmbeddedDatabaseType.H2).build();
    }

}