package demo.diminas.springboot_api_demo.entities;

import demo.diminas.springboot_api_demo.enums.Role;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "tb_client")
public class Client {


    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID uuid;

    @Column(
            length = 100,
            unique = true,
            nullable = false
    )
    private String name;

    @Column(
            length = 100,
            unique = true,
            nullable = false
    )
    private String email;

    @Column(
            length = 50,
            nullable = false
    )
    @Enumerated(value = EnumType.ORDINAL)
    private Role role;

    @Column(
            length = 255,
            nullable = false
    )
    private String password;

    public Client() {
    }

    public Client(UUID uuid, String name, String email, Role role, String password) {
        this.uuid = uuid;
        this.name = name;
        this.email = email;
        this.role = role;
        this.password = password;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
