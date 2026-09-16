package p000;

import java.util.List;

/* JADX INFO: renamed from: ۦِؑۗۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3940 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ List f13152;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f13153;

    public /* synthetic */ C3940(int i, List list) {
        this.f13153 = i;
        this.f13152 = list;
    }

    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        int i = this.f13153;
        List list = this.f13152;
        switch (i) {
            case 0:
                Integer num = (Integer) list.get(2);
                num.getClass();
                return num;
            default:
                return Integer.valueOf(list.size());
        }
    }
}
