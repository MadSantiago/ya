package p000;

import android.os.Bundle;
import java.util.TreeSet;

/* JADX INFO: renamed from: ۦٓؒٓٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4108 implements Runnable {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C5235 f13697;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Bundle f13698;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f13699;

    public /* synthetic */ RunnableC4108(C5235 c5235, Bundle bundle, int i) {
        this.f13699 = i;
        this.f13698 = bundle;
        this.f13697 = c5235;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f13699;
        Bundle bundle = this.f13698;
        C5235 c5235 = this.f13697;
        switch (i) {
            case 0:
                c5235.mo6517();
                c5235.m7643();
                String string = bundle.getString("name");
                String string2 = bundle.getString("origin");
                AbstractC0487.m1090(string);
                AbstractC0487.m1090(string2);
                AbstractC0487.m1047(bundle.get("value"));
                C5371 c5371 = (C5371) c5235.f18660;
                if (!c5371.m9024()) {
                    C3610 c3610 = c5371.f17717;
                    C5371.m9020(c3610);
                    c3610.f12023.m9432("Conditional property not set since app measurement is disabled");
                } else {
                    C1477 c1477 = new C1477(bundle.getLong("triggered_timestamp"), bundle.get("value"), string, string2);
                    try {
                        C1512 c1512 = c5371.f17721;
                        C5371.m9021(c1512);
                        bundle.getString("app_id");
                        C2679 c2679M3224 = c1512.m3224(bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, 0L, true);
                        C5371.m9021(c1512);
                        bundle.getString("app_id");
                        C2679 c2679M3225 = c1512.m3224(bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, 0L, true);
                        bundle.getString("app_id");
                        c5371.m9028().m9516(new C1513(bundle.getString("app_id"), string2, c1477, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), c2679M3225, bundle.getLong("trigger_timeout"), c2679M3224, bundle.getLong("time_to_live"), c1512.m3224(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, 0L, true)));
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
                break;
            case 1:
                c5235.mo6517();
                c5235.m7643();
                String string3 = bundle.getString("name");
                AbstractC0487.m1090(string3);
                C5371 c5372 = (C5371) c5235.f18660;
                if (!c5372.m9024()) {
                    C3610 c3611 = c5372.f17717;
                    C5371.m9020(c3611);
                    c3611.f12023.m9432("Conditional property not cleared since app measurement is disabled");
                } else {
                    C1477 c1478 = new C1477(0L, null, string3, "");
                    try {
                        C1512 c1513 = c5372.f17721;
                        C5371.m9021(c1513);
                        bundle.getString("app_id");
                        c5372.m9028().m9516(new C1513(bundle.getString("app_id"), "", c1478, bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), c1513.m3224(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), 0L, true)));
                    } catch (IllegalArgumentException unused2) {
                        return;
                    }
                }
                break;
            default:
                C2391 c2391 = c5235.f17281;
                C5371 c5373 = (C5371) c5235.f18660;
                if (!bundle.isEmpty()) {
                    C4474 c4474 = c5373.f17713;
                    C1512 c1514 = c5373.f17721;
                    C0515 c0515 = c5373.f17715;
                    C3610 c3612 = c5373.f17717;
                    C5371.m9021(c4474);
                    Bundle bundle2 = new Bundle(c4474.f14752.m3130());
                    for (String str : bundle.keySet()) {
                        Object obj = bundle.get(str);
                        if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                            C5371.m9021(c1514);
                            if (C1512.m3195(obj)) {
                                C1512.m3191(c2391, null, 27, null, null, 0);
                            }
                            C5371.m9020(c3612);
                            c3612.f12021.m9434(str, obj, "Invalid default event parameter type. Name, value");
                        } else if (C1512.m3188(str)) {
                            C5371.m9020(c3612);
                            c3612.f12021.m9430(str, "Invalid default event parameter name. Name");
                        } else if (obj == null) {
                            bundle2.remove(str);
                        } else {
                            C5371.m9021(c1514);
                            c0515.getClass();
                            if (c1514.m3235("param", str, 500, obj)) {
                                c1514.m3231(bundle2, str, obj);
                            }
                        }
                    }
                    C5371.m9021(c1514);
                    C1512 c1515 = ((C5371) c0515.f18660).f17721;
                    C5371.m9021(c1515);
                    int i2 = c1515.m3227(201500000) ? 100 : 25;
                    if (bundle2.size() > i2) {
                        int i3 = 0;
                        for (String str2 : new TreeSet(bundle2.keySet())) {
                            i3++;
                            if (i3 > i2) {
                                bundle2.remove(str2);
                            }
                        }
                        C5371.m9021(c1514);
                        C1512.m3191(c2391, null, 26, null, null, 0);
                        C5371.m9020(c3612);
                        c3612.f12021.m9432("Too many default event parameters set. Discarding beyond event parameter limit");
                    }
                    bundle = bundle2;
                }
                C4474 c4475 = c5373.f17713;
                C5371.m9021(c4475);
                c4475.f14752.m3144(bundle);
                c5373.m9028().m9521(bundle);
                break;
        }
    }
}
