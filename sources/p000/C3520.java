package p000;

import java.io.IOException;

/* JADX INFO: renamed from: ۦؘۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3520 extends AbstractC2797 {

    /* JADX INFO: renamed from: ۥُ */
    public final /* synthetic */ C0127 f11656;

    /* JADX INFO: renamed from: ۥّ */
    public final /* synthetic */ int f11657;

    /* JADX INFO: renamed from: ۥۜ */
    public final /* synthetic */ int f11658;

    /* JADX INFO: renamed from: ۦۙ */
    public final /* synthetic */ C1270 f11659;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3520(String str, C0127 c0127, int i, C1270 c1270, int i2, boolean z) {
        super(str, true);
        this.f11656 = c0127;
        this.f11657 = i;
        this.f11659 = c1270;
        this.f11658 = i2;
    }

    @Override // p000.AbstractC2797
    /* JADX INFO: renamed from: ۥۣ */
    public final long mo583() {
        try {
            C0373 c0373 = this.f11656.f516;
            C1270 c1270 = this.f11659;
            int i = this.f11658;
            c0373.getClass();
            c1270.skip(i);
            this.f11656.f524.m5835(this.f11657, 9);
            synchronized (this.f11656) {
                this.f11656.f508.remove(Integer.valueOf(this.f11657));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
