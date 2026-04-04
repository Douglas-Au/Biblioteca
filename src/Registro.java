import java.time.LocalDateTime;

public class Registro {
        private Integer registro_livro;
        private Integer registro_usuario;
        private LocalDateTime data;
        private Integer id_registro;

        public Registro(Livro livro, Usuario user, Integer id_registro){
            registro_livro = livro.getId();
            registro_usuario = user.getId();
            data = LocalDateTime.now();
            this.id_registro = id_registro;
        }

        public Integer getRegistro_livro() {
            return registro_livro;
        }

        public void setRegistro_livro(Integer registro_livro) {
            this.registro_livro = registro_livro;
        }

        public Integer getRegistro_usuario() {
            return registro_usuario;
        }

        public void setRegistro_usuario(Integer registro_usuario) {
            this.registro_usuario = registro_usuario;
        }

        public LocalDateTime getData() {
            return data;
        }

        public void setData(LocalDateTime data) {
            this.data = data;
        }

        public Integer getId_registro() {
            return id_registro;
        }

        public void setId_registro(Integer id_registro) {
            this.id_registro = id_registro;
        }
}
