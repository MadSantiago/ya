package p000;

import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: ۥؙۙؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2224 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ int f7363;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f7364;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f7365;

    public /* synthetic */ C2224(int i, int i2, Object obj) {
        this.f7365 = i2;
        this.f7363 = i;
        this.f7364 = obj;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) throws Exception {
        C3193 c3193;
        int i = this.f7365;
        C2358 c2358 = C2358.f7817;
        Object obj2 = this.f7364;
        int i2 = this.f7363;
        switch (i) {
            case 0:
                String str = (String) obj2;
                InterfaceC0252 interfaceC0252Mo971 = ((InterfaceC3879) obj).mo971("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
                try {
                    interfaceC0252Mo971.mo530(1, str);
                    interfaceC0252Mo971.mo532(i2, 2);
                    int iM8613 = C5063.m8613(interfaceC0252Mo971, "work_spec_id");
                    int iM8614 = C5063.m8613(interfaceC0252Mo971, "generation");
                    int iM8615 = C5063.m8613(interfaceC0252Mo971, "system_id");
                    if (interfaceC0252Mo971.mo533()) {
                        c3193 = new C3193((int) interfaceC0252Mo971.getLong(iM8614), (int) interfaceC0252Mo971.getLong(iM8615), interfaceC0252Mo971.mo534(iM8613));
                        break;
                    } else {
                        c3193 = null;
                    }
                    return c3193;
                } finally {
                    interfaceC0252Mo971.close();
                }
            case 1:
                String str2 = (String) obj2;
                InterfaceC0252 interfaceC0252Mo972 = ((InterfaceC3879) obj).mo971("UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)");
                try {
                    interfaceC0252Mo972.mo530(1, str2);
                    interfaceC0252Mo972.mo532(i2, 2);
                    interfaceC0252Mo972.mo533();
                    return c2358;
                } finally {
                    interfaceC0252Mo972.close();
                }
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                String str3 = (String) obj2;
                InterfaceC0252 interfaceC0252Mo973 = ((InterfaceC3879) obj).mo971("UPDATE workspec SET stop_reason=? WHERE id=?");
                try {
                    interfaceC0252Mo973.mo532(i2, 1);
                    interfaceC0252Mo973.mo530(2, str3);
                    interfaceC0252Mo973.mo533();
                    return c2358;
                } finally {
                    interfaceC0252Mo973.close();
                }
            default:
                return Boolean.valueOf(((List) obj).addAll(i2, (Collection) obj2));
        }
    }

    public /* synthetic */ C2224(int i, int i2, String str) {
        this.f7365 = i2;
        this.f7364 = str;
        this.f7363 = i;
    }
}
