package kodla.io.rentAcar.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Table(name = "brands") //Brand tablosu oluşturuldu.
@Data // Getter Setter oluşturukdu.
@AllArgsConstructor // Parametreli Constructor eklendi.
@NoArgsConstructor // Parametresiz Constructor eklendi.
@Entity // Veritabanı varlığı tanımlama.
public class Brand {
    @Id //Primary Key alanı
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Id++
    @Column(name = "brand_id") // Kolonun veritabanında id karşılığı
    private int brandId;
    @Column(name = "brand_name") // Kolonun veritabanında name karşılığı
    private String brandName;
    @OneToMany(mappedBy = "brand")
    private List<Model> models;
}
