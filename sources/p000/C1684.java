package p000;

import android.content.Context;

/* JADX INFO: renamed from: ۥٍٙؗٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1684 implements InterfaceC2488 {

    /* JADX INFO: renamed from: ۥَ */
    public final boolean f5601;

    /* JADX INFO: renamed from: ۥْ */
    public final C0322 f5602;

    /* JADX INFO: renamed from: ۥٓ */
    public final boolean f5603;

    /* JADX INFO: renamed from: ۥٖ */
    public final C2432 f5604 = new C2432(new C0101(15, this));

    /* JADX INFO: renamed from: ۦٗ */
    public boolean f5605;

    /* JADX INFO: renamed from: ۦ۟ */
    public final String f5606;

    /* JADX INFO: renamed from: ۦۨ */
    public final Context f5607;

    public C1684(Context context, String str, C0322 c0322, boolean z, boolean z2) {
        this.f5607 = context;
        this.f5606 = str;
        this.f5602 = c0322;
        this.f5603 = z;
        this.f5601 = z2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C2432 c2432 = this.f5604;
        if (c2432.m4545()) {
            ((C3289) c2432.getValue()).close();
        }
    }

    @Override // p000.InterfaceC2488
    public final String getDatabaseName() {
        return this.f5606;
    }

    @Override // p000.InterfaceC2488
    public final void setWriteAheadLoggingEnabled(boolean z) {
        C2432 c2432 = this.f5604;
        if (c2432.m4545()) {
            ((C3289) c2432.getValue()).setWriteAheadLoggingEnabled(z);
        }
        this.f5605 = z;
    }

    @Override // p000.InterfaceC2488
    /* JADX INFO: renamed from: ۦۣ */
    public final C0956 mo3508() {
        return ((C3289) this.f5604.getValue()).m6049(true);
    }
}
