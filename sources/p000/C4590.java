package p000;

import android.content.Context;
import android.os.Process;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: ۦٚ۟ؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4590 {

    /* JADX INFO: renamed from: ۥؗ */
    public final int f15142 = Process.myPid();

    /* JADX INFO: renamed from: ۥُ */
    public final C2432 f15143;

    /* JADX INFO: renamed from: ۥّ */
    public boolean f15144;

    /* JADX INFO: renamed from: ۥۗ */
    public final C2432 f15145;

    /* JADX INFO: renamed from: ۥۣ */
    public final Context f15146;

    /* JADX INFO: renamed from: ۦؑ */
    public final C2432 f15147;

    public C4590(Context context, C3142 c3142) {
        this.f15146 = context;
        final int i = 0;
        this.f15145 = new C2432(new InterfaceC4448(this) { // from class: ۥًؓۡٚ

            /* JADX INFO: renamed from: ۦ۟ */
            public final /* synthetic */ C4590 f2933;

            {
                this.f2933 = this;
            }

            @Override // p000.InterfaceC4448
            /* JADX INFO: renamed from: ۥۣ */
            public final Object mo449() {
                int i2 = i;
                C4590 c4590 = this.f2933;
                switch (i2) {
                    case 0:
                        return ((C2271) c4590.f15143.getValue()).f7534;
                    default:
                        return AbstractC0993.m2147(c4590.f15146);
                }
            }
        });
        this.f15147 = new C2432(new C0101(26, c3142));
        final int i2 = 1;
        this.f15143 = new C2432(new InterfaceC4448(this) { // from class: ۥًؓۡٚ

            /* JADX INFO: renamed from: ۦ۟ */
            public final /* synthetic */ C4590 f2933;

            {
                this.f2933 = this;
            }

            @Override // p000.InterfaceC4448
            /* JADX INFO: renamed from: ۥۣ */
            public final Object mo449() {
                int i3 = i2;
                C4590 c4590 = this.f2933;
                switch (i3) {
                    case 0:
                        return ((C2271) c4590.f15143.getValue()).f7534;
                    default:
                        return AbstractC0993.m2147(c4590.f15146);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final Map m7956(Map map) {
        C2432 c2432 = this.f15147;
        if (map == null) {
            return Collections.singletonMap(m7957(), new C1060(Process.myPid(), (String) c2432.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(m7957(), new C1060(Process.myPid(), (String) c2432.getValue()));
        return AbstractC4554.m7938(linkedHashMap);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final String m7957() {
        return (String) this.f15145.getValue();
    }
}
