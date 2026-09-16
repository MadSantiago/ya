package p000;

import java.io.InputStream;

/* JADX INFO: renamed from: ۥٕۨؗٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2942 implements InterfaceC1411, InterfaceC3324 {

    /* JADX INFO: renamed from: ۦۨ */
    public boolean f9879;

    public /* synthetic */ C2942(boolean z) {
        this.f9879 = z;
    }

    @Override // p000.InterfaceC1411
    /* JADX INFO: renamed from: ۥّ */
    public boolean mo2977(C0181 c0181) {
        return this.f9879;
    }

    @Override // p000.InterfaceC1411
    /* JADX INFO: renamed from: ۥۗ */
    public boolean mo2978() {
        return this.f9879;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC3324
    /* JADX INFO: renamed from: ۥۣ */
    public /* bridge */ /* synthetic */ Object mo5516(C3455 c3455) {
        C0336 c0336M770;
        InputStream inputStreamM8131 = C4773.m8131(c3455);
        try {
            int i = 4096;
            if (this.f9879) {
                if (inputStreamM8131 instanceof InterfaceC5502) {
                    long length = ((InterfaceC5502) inputStreamM8131).mo1546().length();
                    if (length == 0) {
                        i = 512;
                    } else if (length < 4096) {
                        i = (int) length;
                    }
                }
                c0336M770 = C0336.m770(AbstractC4650.m8025(inputStreamM8131, i), true);
            } else {
                c0336M770 = C0336.m770(AbstractC4650.m8025(inputStreamM8131, 4096), false);
            }
            AbstractC4554.m7932(inputStreamM8131, null);
            return c0336M770;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC4554.m7932(inputStreamM8131, th);
                throw th2;
            }
        }
    }
}
