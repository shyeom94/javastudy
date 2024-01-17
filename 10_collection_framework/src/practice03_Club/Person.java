package practice03_Club;

public class Person {
  
  // field
  private String id;
  
  // constructor
  public Person() {
    
  }

  public Person(String id) {
    super();
    this.id = id;
  }

  // method 
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "Person [id=" + id + "]";
  }

///////////////////////////////////////////////////////////////////////////////////////  
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }
  
  // search 
  /*
   * 1. part - hash code 해시값 먼저 만들고,
   * 2. equals           그 다음 equals
   */

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Person other = (Person) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }
  
  

}
