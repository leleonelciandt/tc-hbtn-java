import java.util.ArrayList;
import java.util.List;

public class ProcessadorVideo {
    List<CanalNotificacao> canais = new ArrayList<>();

    public List<CanalNotificacao> getCanais() {
        return canais;
    }

    public void setCanais(List<CanalNotificacao> canais) {
        this.canais = canais;
    }

    public void registrarCanal(CanalNotificacao canalNotificado){
        canais.add(canalNotificado);

    }

    public void processar(Video video){
        for (CanalNotificacao canal : this.getCanais()) {
            Mensagem mensagem = new Mensagem(TipoMensagem.LOG, video.getArquivo() + " - " + video.getFormato()) ;
            canal.notificar(mensagem);
        }
    }

}
