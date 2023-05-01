package kodla.io.rentAcar.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "brands") //Brand tablosu oluşturuldu.
@Data // Getter Setter oluşturukdu.
@AllArgsConstructor // Parametreli Constructor eklendi.
@NoArgsConstructor // Parametresiz Constructor eklendi.
@Entity // Veritabanı varlığı tanımlama.
public class Brand {
    @Id //Primary Key alanı
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Id++
    @Column(name = "id") // Kolonun veritabanında id karşılığı
    private int id;
    @Column(name ="name") // Kolonun veritabanında name karşılığı
    private String name;
}
