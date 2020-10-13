package example.spring.project.springpetclinic.model;

import java.time.LocalDate;

/**
 * <p>Pet class.</p>
 *
 * @author Mateusz
 * @version $Id: $Id
 */
public class Pet {

    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;

    /**
     * <p>Getter for the field <code>petType</code>.</p>
     *
     * @return a {@link example.spring.project.springpetclinic.model.PetType} object.
     */
    public PetType getPetType() {
        return petType;
    }

    /**
     * <p>Setter for the field <code>petType</code>.</p>
     *
     * @param petType a {@link example.spring.project.springpetclinic.model.PetType} object.
     */
    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    /**
     * <p>Getter for the field <code>owner</code>.</p>
     *
     * @return a {@link example.spring.project.springpetclinic.model.Owner} object.
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * <p>Setter for the field <code>owner</code>.</p>
     *
     * @param owner a {@link example.spring.project.springpetclinic.model.Owner} object.
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    /**
     * <p>Getter for the field <code>birthDate</code>.</p>
     *
     * @return a {@link java.time.LocalDate} object.
     */
    public LocalDate getBirthDate() {
        return birthDate;
    }

    /**
     * <p>Setter for the field <code>birthDate</code>.</p>
     *
     * @param birthDate a {@link java.time.LocalDate} object.
     */
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
