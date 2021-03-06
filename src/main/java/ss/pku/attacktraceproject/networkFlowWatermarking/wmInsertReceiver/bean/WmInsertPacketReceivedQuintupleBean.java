package ss.pku.attacktraceproject.networkFlowWatermarking.wmInsertReceiver.bean;

public class WmInsertPacketReceivedQuintupleBean {
    public String src_ip;
    public int src_port;
    public String dst_ip;
    public int dst_port;
    public int version;

    public WmInsertPacketReceivedQuintupleBean(String src_ip, int src_port, String dst_ip, int dst_port, int version) {
        this.src_ip = src_ip;
        this.src_port = src_port;
        this.dst_ip = dst_ip;
        this.dst_port = dst_port;
        this.version = version;
    }

    public WmInsertPacketReceivedQuintupleBean(String src_ip, String dst_ip) {
        this.src_ip = src_ip;
        this.dst_ip = dst_ip;
    }

    public WmInsertPacketReceivedQuintupleBean() {
    }


    public String getSrc_ip() {
        return src_ip;
    }

    public void setSrc_ip(String src_ip) {
        this.src_ip = src_ip;
    }

    public int getSrc_port() {
        return src_port;
    }

    public void setSrc_port(int src_port) {
        this.src_port = src_port;
    }

    public String getDst_ip() {
        return dst_ip;
    }

    public void setDst_ip(String dst_ip) {
        this.dst_ip = dst_ip;
    }

    public int getDst_port() {
        return dst_port;
    }

    public void setDst_port(int dst_port) {
        this.dst_port = dst_port;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }



    @Override
    public String toString() {
        return "WmInsertPacketReceivedQuintupleBean{" +
                "src_ip='" + src_ip + '\'' +
                ", src_port=" + src_port +
                ", dst_ip='" + dst_ip + '\'' +
                ", dst_port=" + dst_port +
                ", version=" + version +
                '}';
    }
}
