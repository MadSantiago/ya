package p000;

/* JADX INFO: renamed from: ۦَِٕؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4206 {

    /* JADX INFO: renamed from: ۥؗ */
    public C0914 f13965;

    /* JADX INFO: renamed from: ۥۗ */
    public C4995 f13966;

    /* JADX INFO: renamed from: ۥۣ */
    public Object f13967;

    /* JADX INFO: renamed from: ۦؑ */
    public boolean f13968;

    public final void finalize() {
        C0914 c0914;
        C4995 c4995 = this.f13966;
        if (c4995 != null) {
            C5112 c5112 = c4995.f16533;
            if (!c5112.isDone()) {
                c5112.mo1898(new C0100(2, "The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f13967));
            }
        }
        if (this.f13968 || (c0914 = this.f13965) == null) {
            return;
        }
        c0914.m6602(null);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m7428(Throwable th) {
        this.f13968 = true;
        C4995 c4995 = this.f13966;
        if (c4995 == null || !c4995.f16533.mo1898(th)) {
            return;
        }
        this.f13967 = null;
        this.f13966 = null;
        this.f13965 = null;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m7429(Object obj) {
        this.f13968 = true;
        C4995 c4995 = this.f13966;
        if (c4995 == null || !c4995.f16533.m6602(obj)) {
            return;
        }
        this.f13967 = null;
        this.f13966 = null;
        this.f13965 = null;
    }
}
