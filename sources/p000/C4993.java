package p000;

import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: ۦۗۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4993 implements InterfaceC3744, InterfaceC1463, InterfaceC2342 {

    /* JADX INFO: renamed from: ۥَ */
    public int f16523;

    /* JADX INFO: renamed from: ۥْ */
    public final C3580 f16524;

    /* JADX INFO: renamed from: ۥٓ */
    public int f16525;

    /* JADX INFO: renamed from: ۥٖ */
    public int f16526;

    /* JADX INFO: renamed from: ۦٗ */
    public Exception f16527;

    /* JADX INFO: renamed from: ۦۛ */
    public boolean f16528;

    /* JADX INFO: renamed from: ۦ۟ */
    public final int f16529;

    /* JADX INFO: renamed from: ۦۨ */
    public final Object f16530 = new Object();

    public C4993(int i, C3580 c3580) {
        this.f16529 = i;
        this.f16524 = c3580;
    }

    @Override // p000.InterfaceC2342
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo2242() {
        synchronized (this.f16530) {
            this.f16526++;
            this.f16528 = true;
            m8385();
        }
    }

    @Override // p000.InterfaceC1463
    /* JADX INFO: renamed from: ۥُ */
    public final void mo2243(Exception exc) {
        synchronized (this.f16530) {
            this.f16523++;
            this.f16527 = exc;
            m8385();
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m8385() {
        int i = this.f16525;
        int i2 = this.f16523;
        int i3 = i + i2 + this.f16526;
        int i4 = this.f16529;
        if (i3 == i4) {
            Exception exc = this.f16527;
            C3580 c3580 = this.f16524;
            if (exc == null) {
                if (this.f16528) {
                    c3580.m6394();
                    return;
                } else {
                    c3580.m6395(null);
                    return;
                }
            }
            int length = String.valueOf(i2).length();
            StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + length + 8 + 24);
            sb.append(i2);
            sb.append(" out of ");
            sb.append(i4);
            sb.append(" underlying tasks failed");
            c3580.m6393(new ExecutionException(sb.toString(), this.f16527));
        }
    }

    @Override // p000.InterfaceC3744
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo2246(Object obj) {
        synchronized (this.f16530) {
            this.f16525++;
            m8385();
        }
    }
}
