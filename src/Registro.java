import java.time.*;

public class Registro {
        private Integer registro_livro;
        private Integer registro_usuario;
        private LocalDate data;
        private Integer id_registro;
        private LocalDate prazo;
        private int renovado;

        public Registro(Livro livro, Usuario user, Integer id_registro){
            registro_livro = livro.getId();
            registro_usuario = user.getId();
            data = LocalDate.now();
            prazo = data.plusDays(10);
            this.id_registro = id_registro;
            renovado = 0;
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

        public LocalDate getData() {
            return data;
        }

        public void setData() {
            this.data = LocalDate.now();
        }

        public Integer getId_registro() {
            return id_registro;
        }

        public void setId_registro(Integer id_registro) {
            this.id_registro = id_registro;
        }


        public LocalDate getPrazo() {
            return prazo;
        }

        public void setPrazo(LocalDate prazo) {
            this.prazo = prazo;
        }

        public int getRenovado() {
            return renovado;
        }

        public void setRenovado(int renovado) {
            this.renovado = renovado;
        }
}
