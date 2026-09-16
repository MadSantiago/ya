package p000;

import java.util.Map;

/* JADX INFO: renamed from: ۥٖٛؕۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1777 implements InterfaceC1180 {

    /* JADX INFO: renamed from: ۥؗ */
    public final /* synthetic */ C2950 f5927;

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ Object f5928;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ C5108 f5929;

    public C1777(C5108 c5108, Object obj, C2950 c2950) {
        this.f5929 = c5108;
        this.f5928 = obj;
        this.f5927 = c2950;
    }

    @Override // p000.InterfaceC1180
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo497() {
        C5108 c5108 = this.f5929;
        C3262 c3262 = c5108.f16953;
        Object obj = this.f5928;
        Object objM6026 = c3262.m6026(obj);
        C2950 c2950 = this.f5927;
        if (objM6026 == c2950) {
            Map map = c5108.f16954;
            Map mapMo1715 = c2950.mo1715();
            if (mapMo1715.isEmpty()) {
                map.remove(obj);
            } else {
                map.put(obj, mapMo1715);
            }
        }
    }
}
