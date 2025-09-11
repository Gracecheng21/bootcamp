package abstraction;


// Skill OR Contract
// ! Bad idea using "Shape" as interface, Shape is NOT a skill
public interface Shape {
  // ! Interface has NO attribute
  // ! Interface has NO concrete method (public & abstract only)
  // Interface is 100% abstraction (Before )
  double area(); // ! implicitly public and abstract
}
