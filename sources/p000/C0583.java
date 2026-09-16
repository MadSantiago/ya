package p000;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: renamed from: ۥؚؗؑۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0583 extends AbstractC5263 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final C0583 f2176 = new C0583(C5586.f18420);

    /* JADX INFO: renamed from: ۥۣ */
    public final AtomicReference f2177;

    public C0583(AbstractC5263 abstractC5263) {
        this.f2177 = new AtomicReference(abstractC5263);
    }

    @Override // p000.AbstractC5263
    /* JADX INFO: renamed from: ۥؗ */
    public final AbstractC4489 mo1288() {
        return ((AbstractC5263) this.f2177.get()).mo1288();
    }

    @Override // p000.AbstractC5263
    /* JADX INFO: renamed from: ۥۗ */
    public final C5324 mo1289() {
        return ((AbstractC5263) this.f2177.get()).mo1289();
    }

    @Override // p000.AbstractC5263
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo1290(String str, Level level, boolean z) {
        ((AbstractC5263) this.f2177.get()).mo1290(str, level, z);
    }
}
