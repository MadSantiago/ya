package p000;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;

/* JADX INFO: renamed from: ۦَؔۦٕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3847 implements InterfaceC3879, InterfaceC3087 {

    /* JADX INFO: renamed from: ۥْ */
    public InterfaceC3534 f12861;

    /* JADX INFO: renamed from: ۥٓ */
    public Throwable f12862;

    /* JADX INFO: renamed from: ۦ۟ */
    public final InterfaceC3087 f12863;

    /* JADX INFO: renamed from: ۦۨ */
    public final InterfaceC3879 f12864;

    public C3847(InterfaceC3879 interfaceC3879) {
        C1387 c1387 = new C1387();
        this.f12864 = interfaceC3879;
        this.f12863 = c1387;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        this.f12864.close();
    }

    public final String toString() {
        return this.f12864.toString();
    }

    @Override // p000.InterfaceC3879
    /* JADX INFO: renamed from: ۥٝ */
    public final InterfaceC0252 mo971(String str) {
        return this.f12864.mo971(str);
    }

    @Override // p000.InterfaceC3087
    /* JADX INFO: renamed from: ۥۗ */
    public final Object mo2949(AbstractC0772 abstractC0772) {
        return this.f12863.mo2949(abstractC0772);
    }

    @Override // p000.InterfaceC3087
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo2950(Object obj) {
        this.f12863.mo2950(null);
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public final void m6889(StringBuilder sb) {
        if (this.f12861 == null && this.f12862 == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
            return;
        }
        sb.append("\t\tStatus: Acquired connection");
        sb.append('\n');
        InterfaceC3534 interfaceC3534 = this.f12861;
        if (interfaceC3534 != null) {
            sb.append("\t\tCoroutine: " + interfaceC3534);
            sb.append('\n');
        }
        Throwable th = this.f12862;
        if (th != null) {
            sb.append("\t\tAcquired:");
            sb.append('\n');
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            printWriter.flush();
            Iterator it = AbstractC0973.m2038(AbstractC0684.m1523(stringWriter.toString())).iterator();
            while (it.hasNext()) {
                sb.append("\t\t" + ((String) it.next()));
                sb.append('\n');
            }
        }
    }
}
