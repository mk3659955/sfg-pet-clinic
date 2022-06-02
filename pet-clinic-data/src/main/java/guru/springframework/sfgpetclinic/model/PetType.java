package guru.springframework.sfgpetclinic.model;

import lombok.Getter;
import lombok.Setter;

public class PetType extends BaseEntity
{
    @Getter
    @Setter
    private String name;
}
