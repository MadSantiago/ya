package p000;

/* JADX INFO: renamed from: ۦؚٕؕٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3601 extends AbstractC0044 implements Runnable {

    /* JADX INFO: renamed from: ۦۛ */
    public InterfaceFutureC4378 f11996;

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceFutureC4378 interfaceFutureC4378 = this.f11996;
        if (interfaceFutureC4378 != null) {
            m3766(interfaceFutureC4378);
        }
    }

    @Override // p000.AbstractC0032
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo2772() {
        this.f11996 = null;
    }

    @Override // p000.AbstractC0032
    /* JADX INFO: renamed from: ۦِ */
    public final String mo2773() {
        InterfaceFutureC4378 interfaceFutureC4378 = this.f11996;
        if (interfaceFutureC4378 == null) {
            return null;
        }
        String strValueOf = String.valueOf(interfaceFutureC4378);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 11);
        sb.append("delegate=[");
        sb.append(strValueOf);
        sb.append("]");
        return sb.toString();
    }
}
