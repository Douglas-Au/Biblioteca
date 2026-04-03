import java.time.LocalDateTime;

public class Registro {
        private Livro registro_livro;
        private Usuario registro_usuario;
        private LocalDateTime data;
        private Integer id_registro;

        public Registro(Livro livro, Usuario user, Integer id_registro){
            registro_livro = livro;
            registro_usuario = user;
            data = LocalDateTime.now();
            this.id_registro = id_registro;
        }

        public Livro getRegistro_livro() {
            return registro_livro;
        }

        public void setRegistro_livro(Livro registro_livro) {
            this.registro_livro = registro_livro;
        }

        public Usuario getRegistro_usuario() {
            return registro_usuario;
        }

        public void setRegistro_usuario(Usuario registro_usuario) {
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
