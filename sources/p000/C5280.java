package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: ۦؘۜؓ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5280 {

    /* JADX INFO: renamed from: ۥؗ */
    public final Context f17398;

    /* JADX INFO: renamed from: ۥُ */
    public final C2432 f17399;

    /* JADX INFO: renamed from: ۥّ */
    public final LinkedHashSet f17400;

    /* JADX INFO: renamed from: ۥۗ */
    public final C3408 f17401;

    /* JADX INFO: renamed from: ۥۣ */
    public final C5558 f17402;

    /* JADX INFO: renamed from: ۦؑ */
    public final String f17403;

    public C5280(Context context, String str, Set set, C5558 c5558, C3408 c3408) {
        LinkedHashSet linkedHashSet;
        C5304 c5304 = new C5304(11, context, str);
        this.f17402 = c5558;
        this.f17401 = c3408;
        this.f17398 = context;
        this.f17403 = str;
        this.f17399 = new C2432(c5304);
        if (set == AbstractC3802.f12623) {
            linkedHashSet = null;
        } else {
            Set set2 = set;
            if (set2 instanceof Collection) {
                linkedHashSet = new LinkedHashSet(set2);
            } else {
                linkedHashSet = new LinkedHashSet();
                AbstractC0973.m2036(set2, linkedHashSet);
            }
        }
        this.f17400 = linkedHashSet;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۥۣ */
    public final Object m8916(Object obj, AbstractC0772 abstractC0772) throws Throwable {
        C4584 c4584;
        if (abstractC0772 instanceof C4584) {
            c4584 = (C4584) abstractC0772;
            int i = c4584.f15130;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4584.f15130 = i - Integer.MIN_VALUE;
            } else {
                c4584 = new C4584(this, abstractC0772);
            }
        } else {
            c4584 = new C4584(this, abstractC0772);
        }
        Object objMo219 = c4584.f15127;
        int i2 = c4584.f15130;
        boolean z = true;
        if (i2 == 0) {
            AbstractC0186.m409(objMo219);
            c4584.f15128 = this;
            c4584.f15130 = 1;
            objMo219 = this.f17402.mo219(obj, c4584);
            EnumC2282 enumC2282 = EnumC2282.f7590;
            if (objMo219 == enumC2282) {
                return enumC2282;
            }
        } else {
            if (i2 != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = c4584.f15128;
            AbstractC0186.m409(objMo219);
        }
        if (!((Boolean) objMo219).booleanValue()) {
            return Boolean.FALSE;
        }
        LinkedHashSet linkedHashSet = this.f17400;
        C2432 c2432 = this.f17399;
        if (linkedHashSet != null) {
            SharedPreferences sharedPreferences = (SharedPreferences) c2432.getValue();
            if (linkedHashSet.isEmpty()) {
                z = false;
            } else {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    if (sharedPreferences.contains((String) it.next())) {
                    }
                }
                z = false;
            }
        } else if (((SharedPreferences) c2432.getValue()).getAll().isEmpty()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
