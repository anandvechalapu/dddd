

@RestController
public class LogoutController {

    private final LogoutService logoutService;

    @Autowired
    public LogoutController(LogoutService logoutService) {
        this.logoutService = logoutService;
    }

    @PostMapping("/logout")
    public void logout(){
        logoutService.logout();
    }

}

@Service
public class LogoutService {

    private final LogoutRepository logoutRepository;

    @Autowired
    public LogoutService(LogoutRepository logoutRepository) {
        this.logoutRepository = logoutRepository;
    }

    public void logout(){
        logoutRepository.logout();
    }
}

@Repository
public interface LogoutRepository {

    void logout();

}