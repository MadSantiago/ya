package p000;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: renamed from: ۥ۠ؖۘؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2518 {

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ C1443 f8350;

    /* JADX INFO: renamed from: ۥۣ */
    public final SharedPreferences.Editor f8351;

    public C2518(C1443 c1443) {
        Object c4535;
        this.f8350 = c1443;
        try {
            c4535 = c1443.m3067().edit();
        } catch (Throwable th) {
            c4535 = new C4535(th);
        }
        this.f8351 = (SharedPreferences.Editor) (c4535 instanceof C4535 ? null : c4535);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m4661(Object obj, String str) {
        boolean z = obj instanceof String;
        SharedPreferences.Editor editor = this.f8351;
        C1443 c1443 = this.f8350;
        if (z) {
            String str2 = (String) obj;
            if (C1443.f4940 && !c1443.f4946) {
                ArrayList arrayList = C2503.f8322;
                C2503.m4652("YukiHookPrefsBridge.Editor not allowed in Xposed Environment");
                return;
            } else {
                if (editor != null) {
                    editor.putString(str, str2);
                    return;
                }
                return;
            }
        }
        if (obj instanceof Set) {
            Set<String> set = (Set) obj;
            if (C1443.f4940 && !c1443.f4946) {
                ArrayList arrayList2 = C2503.f8322;
                C2503.m4652("YukiHookPrefsBridge.Editor not allowed in Xposed Environment");
                return;
            } else {
                if (editor != null) {
                    editor.putStringSet(str, set);
                    return;
                }
                return;
            }
        }
        if (obj instanceof Integer) {
            int iIntValue = ((Number) obj).intValue();
            if (C1443.f4940 && !c1443.f4946) {
                ArrayList arrayList3 = C2503.f8322;
                C2503.m4652("YukiHookPrefsBridge.Editor not allowed in Xposed Environment");
                return;
            } else {
                if (editor != null) {
                    editor.putInt(str, iIntValue);
                    return;
                }
                return;
            }
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Number) obj).floatValue();
            if (C1443.f4940 && !c1443.f4946) {
                ArrayList arrayList4 = C2503.f8322;
                C2503.m4652("YukiHookPrefsBridge.Editor not allowed in Xposed Environment");
                return;
            } else {
                if (editor != null) {
                    editor.putFloat(str, fFloatValue);
                    return;
                }
                return;
            }
        }
        if (obj instanceof Long) {
            long jLongValue = ((Number) obj).longValue();
            if (C1443.f4940 && !c1443.f4946) {
                ArrayList arrayList5 = C2503.f8322;
                C2503.m4652("YukiHookPrefsBridge.Editor not allowed in Xposed Environment");
                return;
            } else {
                if (editor != null) {
                    editor.putLong(str, jLongValue);
                    return;
                }
                return;
            }
        }
        if (!(obj instanceof Boolean)) {
            C1078.m2278(AbstractC3761.m6629("Key-Value type ", obj != null ? obj.getClass().getName() : null, " is not allowed"));
            return;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (C1443.f4940 && !c1443.f4946) {
            ArrayList arrayList6 = C2503.f8322;
            C2503.m4652("YukiHookPrefsBridge.Editor not allowed in Xposed Environment");
        } else if (editor != null) {
            editor.putBoolean(str, zBooleanValue);
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m4662() {
        if (C1443.f4940 && !this.f8350.f4946) {
            ArrayList arrayList = C2503.f8322;
            C2503.m4652("YukiHookPrefsBridge.Editor not allowed in Xposed Environment");
        } else {
            SharedPreferences.Editor editor = this.f8351;
            if (editor != null) {
                editor.clear();
            }
        }
    }
}
