package p000;

/* JADX INFO: renamed from: ۥًٖٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1491 extends C5555 implements Runnable {

    /* JADX INFO: renamed from: ۥَ */
    public final long f5062;

    public RunnableC1491(long j, AbstractC0772 abstractC0772) {
        super(abstractC0772, abstractC0772.mo334());
        this.f5062 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3534 interfaceC3534 = this.f6194;
        AbstractC2765.m5134(interfaceC3534);
        String str = ((C3023) interfaceC3534.mo865(C3023.f10184)) != null ? "Room Invalidation Tracker Refresh" : null;
        String string = "Timed out waiting for " + this.f5062 + " ms";
        if (str != null) {
            StringBuilder sb = new StringBuilder("Coroutine \"");
            sb.append(str);
            sb.append("\" ");
            if (string.length() > 0) {
                string = Character.toLowerCase(string.charAt(0)) + string.substring(1);
            }
            sb.append(string);
            string = sb.toString();
        }
        m858(new C4862(string, this));
    }

    @Override // p000.AbstractC0386
    /* JADX INFO: renamed from: ۥۡ */
    public final String mo870() {
        return super.mo870() + "(timeMillis=" + this.f5062 + ')';
    }
}
