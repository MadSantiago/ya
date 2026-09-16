package p000;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;

/* JADX INFO: renamed from: ۦؖۡۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3393 {

    /* JADX INFO: renamed from: ۥؗ */
    public final LinkedHashSet f11289;

    /* JADX INFO: renamed from: ۥۗ */
    public C4142 f11290;

    /* JADX INFO: renamed from: ۥۣ */
    public UUID f11291 = UUID.randomUUID();

    /* JADX INFO: renamed from: ۦؑ */
    public final /* synthetic */ int f11292;

    public C3393(int i, Class cls) {
        this.f11292 = i;
        this.f11290 = new C4142(this.f11291.toString(), (EnumC4972) null, cls.getName(), (String) null, (C2775) null, (C2775) null, 0L, 0L, 0L, (C4628) null, 0, 0, 0L, 0L, 0L, 0L, false, 0, 0, 0L, 0, 0, (String) null, (Boolean) null, 33554426);
        String[] strArr = {cls.getName()};
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC4554.m7911(1));
        linkedHashSet.add(strArr[0]);
        this.f11289 = linkedHashSet;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final AbstractC3104 m6151() {
        AbstractC3104 c2621;
        int i = this.f11292;
        LinkedHashSet linkedHashSet = this.f11289;
        switch (i) {
            case 0:
                c2621 = new C2621(this.f11291, this.f11290, linkedHashSet);
                break;
            default:
                C4142 c4142 = this.f11290;
                if (!c4142.f13780) {
                    c2621 = new C1320(this.f11291, c4142, linkedHashSet);
                } else {
                    C1078.m2272("PeriodicWorkRequests cannot be expedited");
                    c2621 = null;
                }
                break;
        }
        C4628 c4628 = this.f11290.f13791;
        boolean z = !c4628.f15283.isEmpty() || c4628.f15277 || c4628.f15276 || c4628.f15282;
        C4142 c4143 = this.f11290;
        if (c4143.f13780) {
            if (z) {
                C1078.m2272("Expedited jobs only support network and storage constraints");
                return null;
            }
            if (c4143.f13796 > 0) {
                C1078.m2272("Expedited jobs cannot be delayed");
                return null;
            }
        }
        String str = c4143.f13792;
        if (str == null) {
            List listM1524 = AbstractC0684.m1524(c4143.f13776, new String[]{"."});
            String strM9761 = listM1524.size() == 1 ? (String) listM1524.get(0) : (String) AbstractC0973.m2040(listM1524);
            if (strM9761.length() > 127) {
                strM9761 = AbstractC0684.m9761(127, strM9761);
            }
            c4143.f13792 = strM9761;
        } else if (str.length() > 127) {
            this.f11290.f13792 = AbstractC0684.m9761(127, str);
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        this.f11291 = uuidRandomUUID;
        String string = uuidRandomUUID.toString();
        C4142 c4144 = this.f11290;
        this.f11290 = new C4142(string, c4144.f13785, c4144.f13776, c4144.f13788, new C2775(c4144.f13778), new C2775(c4144.f13779), c4144.f13796, c4144.f13786, c4144.f13794, new C4628(c4144.f13791), c4144.f13795, c4144.f13789, c4144.f13790, c4144.f13797, c4144.f13800, c4144.f13799, c4144.f13780, c4144.f13781, c4144.f13777, c4144.f13793, c4144.f13798, c4144.f13784, c4144.f13792, c4144.f13783, 524288);
        return c2621;
    }
}
