
@Grab("spring-boot-starter-actuator")

@RestController
class Example {

   @Autowired
   private MyService myService;
   
   @RequestMapping("/")
   @ResponseBody
   public String hello() {
      "Hello Spring Boot"
   }
   
   
    @GetMapping("/service")
    public String helloWorld() {
        return myService.sayWorld();
    }
}


@Service
class MyService {
    public String sayWorld() {
        return "World!";
    }
}