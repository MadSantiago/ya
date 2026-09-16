package p000;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: ۦُۣؓؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5590 {

    /* JADX INFO: renamed from: ۥؗ */
    public boolean f18424;

    /* JADX INFO: renamed from: ۥۗ */
    public boolean f18425;

    /* JADX INFO: renamed from: ۥۣ */
    public int f18426;

    /* JADX INFO: renamed from: ۦؑ */
    public final Object f18427;

    public C5590(C3610 c3610, int i, boolean z, boolean z2) {
        this.f18427 = c3610;
        this.f18426 = i;
        this.f18425 = z;
        this.f18424 = z2;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public void m9430(Object obj, String str) {
        ((C3610) this.f18427).m6442(this.f18426, this.f18425, this.f18424, str, obj, null, null);
    }

    /* JADX INFO: renamed from: ۥُ */
    public void m9431(String str, Object obj, Object obj2, Object obj3) {
        ((C3610) this.f18427).m6442(this.f18426, this.f18425, this.f18424, str, obj, obj2, obj3);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public void m9432(String str) {
        ((C3610) this.f18427).m6442(this.f18426, this.f18425, this.f18424, str, null, null, null);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX INFO: renamed from: ۥۣ */
    public C5055 m9433(SSLSocket sSLSocket) throws UnknownServiceException {
        C5055 c5055;
        int i;
        boolean z;
        int i2 = this.f18426;
        List list = (List) this.f18427;
        int size = list.size();
        while (true) {
            if (i2 >= size) {
                c5055 = null;
                break;
            }
            c5055 = (C5055) list.get(i2);
            if (c5055.m8581(sSLSocket)) {
                this.f18426 = i2 + 1;
                break;
            }
            i2++;
        }
        if (c5055 == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.f18424);
            sb.append(", modes=");
            sb.append(list);
            String string = Arrays.toString(sSLSocket.getEnabledProtocols());
            sb.append(", supported protocols=");
            sb.append(string);
            throw new UnknownServiceException(sb.toString());
        }
        int i3 = this.f18426;
        int size2 = list.size();
        while (true) {
            i = 0;
            if (i3 >= size2) {
                z = false;
                break;
            }
            if (((C5055) list.get(i3)).m8581(sSLSocket)) {
                z = true;
                break;
            }
            i3++;
        }
        this.f18425 = z;
        boolean z2 = this.f18424;
        ?? r0 = c5055.f16785;
        String[] strArr = c5055.f16782;
        String[] strArrM7227 = strArr != null ? AbstractC4031.m7227(sSLSocket.getEnabledCipherSuites(), strArr, C5700.f18754) : sSLSocket.getEnabledCipherSuites();
        String[] strArrM7228 = r0 != 0 ? AbstractC4031.m7227(sSLSocket.getEnabledProtocols(), r0, C0406.f1490) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        C1206 c1206 = C5700.f18754;
        byte[] bArr = AbstractC4031.f13451;
        int length = supportedCipherSuites.length;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (c1206.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i++;
        }
        if (z2 && i != -1) {
            String str = supportedCipherSuites[i];
            strArrM7227 = (String[]) Arrays.copyOf(strArrM7227, strArrM7227.length + 1);
            strArrM7227[strArrM7227.length - 1] = str;
        }
        C1138 c1138 = new C1138();
        c1138.f3981 = c5055.f16784;
        c1138.f3979 = strArr;
        c1138.f3982 = r0;
        c1138.f3980 = c5055.f16783;
        c1138.m2394((String[]) Arrays.copyOf(strArrM7227, strArrM7227.length));
        c1138.m2395((String[]) Arrays.copyOf(strArrM7228, strArrM7228.length));
        C5055 c5055M2397 = c1138.m2397();
        if (c5055M2397.m8580() != null) {
            sSLSocket.setEnabledProtocols(c5055M2397.f16785);
        }
        if (c5055M2397.m8582() != null) {
            sSLSocket.setEnabledCipherSuites(c5055M2397.f16782);
        }
        return c5055;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public void m9434(Object obj, Object obj2, String str) {
        ((C3610) this.f18427).m6442(this.f18426, this.f18425, this.f18424, str, obj, obj2, null);
    }

    public C5590(List list) {
        this.f18427 = list;
    }
}
