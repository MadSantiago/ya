package p000;

import java.io.IOException;

/* JADX INFO: renamed from: ۥٌٖؒؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0279 extends AbstractC2797 {

    /* JADX INFO: renamed from: ۥُ */
    public final /* synthetic */ C0127 f1006;

    /* JADX INFO: renamed from: ۥّ */
    public final /* synthetic */ int f1007;

    /* JADX INFO: renamed from: ۦۙ */
    public final /* synthetic */ long f1008;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0279(String str, C0127 c0127, int i, long j) {
        super(str, true);
        this.f1006 = c0127;
        this.f1007 = i;
        this.f1008 = j;
    }

    @Override // p000.AbstractC2797
    /* JADX INFO: renamed from: ۥۣ */
    public final long mo583() {
        C0127 c0127 = this.f1006;
        try {
            c0127.f524.m5831(this.f1008, this.f1007);
            return -1L;
        } catch (IOException e) {
            c0127.m277(2, 2, e);
            return -1L;
        }
    }
}
