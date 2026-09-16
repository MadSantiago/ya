package p000;

import java.util.Collections;

/* JADX INFO: renamed from: ۦَُۡؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5438 extends AbstractC0097 {

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f17947;

    public /* synthetic */ C5438(int i) {
        this.f17947 = i;
    }

    @Override // p000.AbstractC0097
    /* JADX INFO: renamed from: ۥۜ */
    public void mo3528(C5008 c5008) {
        switch (this.f17947) {
            case 1:
                c5008.m8422(C1876.class, new C1635(8));
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                c5008.m8422(C2946.class, new C1635(2));
                break;
        }
    }

    @Override // p000.AbstractC0097
    /* JADX INFO: renamed from: ۦِ */
    public final void mo3529(C5008 c5008) {
        switch (this.f17947) {
            case 0:
                c5008.m8424(C1256.class, new C4172(15));
                break;
            case 1:
                c5008.m8424(C1876.class, new C4172(16));
                break;
            default:
                c5008.m8424(C2946.class, C4172.f13894);
                break;
        }
    }

    @Override // p000.AbstractC0097
    /* JADX INFO: renamed from: ۦۙ */
    public void mo3530(C1489 c1489) {
        switch (this.f17947) {
            case 1:
                c1489.m3167(Collections.singleton(new C5353(0)));
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                c1489.m3167(Collections.singleton(new C5353(1)));
                break;
        }
    }
}
