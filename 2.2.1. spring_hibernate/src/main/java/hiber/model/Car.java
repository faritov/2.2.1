package hiber.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "car")
public class Car {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
   private int id;
   @Column(name = "series")
   private int series;

   @Column(name = "model")
   private String model;

   public Car() {
   }

   public Car(int series, String model) {
      this.series = series;
      this.model = model;
   }

   public int getSeries() {
      return series;
   }

   public void setSeries(int series) {
      this.series = series;
   }

   public String getModel() {
      return model;
   }

   public void setModel(String model) {
      this.model = model;
   }

   @Override
   public String toString() {
      return "Car{" +
              "series=" + series +
              ", model='" + model + '\'' +
              '}';
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Car car = (Car) o;
      return id == car.id && series == car.series && Objects.equals(model, car.model);
   }

   @Override
   public int hashCode() {
      return Objects.hash(id, series, model);
   }
}