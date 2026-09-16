package p000;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: renamed from: ۥؕؓؐ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0448 implements InterfaceC3879 {

    /* JADX INFO: renamed from: ۦۨ */
    public final C0956 f1637;

    public C0448(C0956 c0956) {
        this.f1637 = c0956;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f1637.close();
    }

    @Override // p000.InterfaceC3879
    /* JADX INFO: renamed from: ۥۣ, reason: merged with bridge method [inline-methods] */
    public final AbstractC3496 mo971(String str) {
        String upperCase;
        int iHashCode;
        String string = AbstractC0684.m9760(str).toString();
        int length = string.length();
        C0956 c0956 = this.f1637;
        if (length < 3 || ((iHashCode = (upperCase = string.substring(0, 3).toUpperCase(Locale.ROOT)).hashCode()) == 79487 ? !upperCase.equals("PRA") : iHashCode == 81978 ? !upperCase.equals("SEL") : !(iHashCode == 85954 && upperCase.equals("WIT")))) {
            return new C0426(c0956, str);
        }
        C0661 c0661 = new C0661(c0956, str);
        c0661.f2440 = new int[0];
        c0661.f2439 = new long[0];
        c0661.f2441 = new double[0];
        c0661.f2443 = new String[0];
        c0661.f2444 = new byte[0][];
        return c0661;
    }
}
