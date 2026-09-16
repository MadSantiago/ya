package p000;

import java.io.IOException;

/* JADX INFO: renamed from: ۦۤؑٙٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5637 extends AbstractC2797 {

    /* JADX INFO: renamed from: ۥُ */
    public final /* synthetic */ int f18569;

    /* JADX INFO: renamed from: ۥّ */
    public final /* synthetic */ C0127 f18570;

    /* JADX INFO: renamed from: ۥۜ */
    public final /* synthetic */ int f18571;

    /* JADX INFO: renamed from: ۦۙ */
    public final /* synthetic */ int f18572;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5637(String str, C0127 c0127, int i, int i2, int i3) {
        super(str, true);
        this.f18569 = i3;
        this.f18570 = c0127;
        this.f18572 = i;
        this.f18571 = i2;
    }

    @Override // p000.AbstractC2797
    /* JADX INFO: renamed from: ۥۣ */
    public final long mo583() {
        int i = this.f18569;
        int i2 = this.f18571;
        int i3 = this.f18572;
        C0127 c0127 = this.f18570;
        switch (i) {
            case 0:
                try {
                    c0127.f524.m5832(i3, i2, true);
                } catch (IOException e) {
                    c0127.m277(2, 2, e);
                }
                break;
            default:
                try {
                    c0127.f524.m5835(i3, i2);
                } catch (IOException e2) {
                    c0127.m277(2, 2, e2);
                }
                break;
        }
        return -1L;
        return -1L;
    }
}
