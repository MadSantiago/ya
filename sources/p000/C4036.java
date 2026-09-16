package p000;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Log;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import java.util.HashMap;
import java.util.List;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۦّؕؐٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C4036 implements InterfaceC2218, InterfaceC4329, InterfaceC5641, InterfaceC4132, InterfaceC4120, InterfaceC1351, InterfaceC0711, InterfaceC5241 {

    /* JADX INFO: renamed from: ۦ۟ */
    public static C4036 f13461;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f13462;

    public /* synthetic */ C4036(int i) {
        this.f13462 = i;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static Typeface m7232(String str, C1626 c1626, int i) {
        if (i == 0 && AbstractC3831.m6874(c1626, C1626.f5439) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), c1626.f5444, i == 1);
    }

    @Override // p000.InterfaceC4895
    public Object get() {
        return C3729.f12414;
    }

    public String toString() {
        switch (this.f13462) {
            case 1:
                return "Empty";
            default:
                return super.toString();
        }
    }

    @Override // p000.InterfaceC4329
    /* JADX INFO: renamed from: ۥؗ */
    public void mo7233(String str) {
        Log.d("KavaRef", str, null);
    }

    @Override // p000.InterfaceC4132
    /* JADX INFO: renamed from: ۥُ */
    public CharSequence mo5945(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        if (TextUtils.isEmpty(null)) {
            return listPreference.f223.getString(R.string.not_set);
        }
        return null;
    }

    @Override // p000.InterfaceC4329
    /* JADX INFO: renamed from: ۥۗ */
    public void mo7234(String str, Throwable th) {
        Log.w("KavaRef", String.valueOf(str), th);
    }

    @Override // p000.InterfaceC1351
    /* JADX INFO: renamed from: ۥۣ */
    public Typeface mo2860(C1626 c1626, int i) {
        return m7232(null, c1626, i);
    }

    @Override // p000.InterfaceC1351
    /* JADX INFO: renamed from: ۦؑ */
    public Typeface mo2861(C3277 c3277, C1626 c1626, int i) {
        c3277.getClass();
        return m7232("sans-serif", c1626, i);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    @Override // p000.InterfaceC0711
    /* JADX INFO: renamed from: ۦِ */
    public StackTraceElement[] mo1576(StackTraceElement[] stackTraceElementArr) {
        int i;
        HashMap map = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            Integer num = (Integer) map.get(stackTraceElement);
            if (num == null) {
                stackTraceElementArr2[i3] = stackTraceElementArr[i2];
                i3++;
                i4 = 1;
                i = i2;
                break;
                break;
            }
            int iIntValue = num.intValue();
            int i5 = i2 - iIntValue;
            if (i2 + i5 <= stackTraceElementArr.length) {
                int i6 = 0;
                while (true) {
                    if (i6 >= i5) {
                        int iIntValue2 = i2 - num.intValue();
                        if (i4 < 10) {
                            System.arraycopy(stackTraceElementArr, i2, stackTraceElementArr2, i3, iIntValue2);
                            i3 += iIntValue2;
                            i4++;
                        }
                        i = (iIntValue2 - 1) + i2;
                        break;
                    }
                    if (!stackTraceElementArr[iIntValue + i6].equals(stackTraceElementArr[i2 + i6])) {
                        stackTraceElementArr2[i3] = stackTraceElementArr[i2];
                        i3++;
                        i4 = 1;
                        i = i2;
                        break;
                        break;
                    }
                    i6++;
                }
            } else {
                stackTraceElementArr2[i3] = stackTraceElementArr[i2];
                i3++;
                i4 = 1;
                i = i2;
                break;
            }
            map.put(stackTraceElement, Integer.valueOf(i2));
            i2 = i + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i3];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i3);
        return i3 < stackTraceElementArr.length ? stackTraceElementArr3 : stackTraceElementArr;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public List mo3804(Class cls) {
        Object c4535;
        try {
            c4535 = AbstractC0246.m509(cls.getDeclaredMethods());
        } catch (Throwable th) {
            c4535 = new C4535(th);
        }
        Throwable thM405 = AbstractC0183.m405(c4535);
        if (thM405 != null) {
            String str = "Failed to get declared methods in " + this + " because got an exception.";
            if (AbstractC3761.m6632(AbstractC4009.f13362) <= AbstractC3761.m6632(3)) {
                AbstractC4009.f13365.mo7234(str, thM405);
            }
        }
        if (c4535 instanceof C4535) {
            c4535 = null;
        }
        List list = (List) c4535;
        return list == null ? C2340.f7777 : list;
    }

    @Override // p000.InterfaceC4120
    /* JADX INFO: renamed from: ۥّ */
    public int mo4318(int i) {
        return i;
    }

    @Override // p000.InterfaceC4120
    /* JADX INFO: renamed from: ۦۙ */
    public int mo4319(int i) {
        return i;
    }
}
