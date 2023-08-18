package selfproject.registeration.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import selfproject.registeration.models.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
