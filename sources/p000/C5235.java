package p000;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ۦًۛؕٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5235 extends AbstractC4351 {

    /* JADX INFO: renamed from: ۥؓ */
    public PriorityQueue f17267;

    /* JADX INFO: renamed from: ۥؖ */
    public C0826 f17268;

    /* JADX INFO: renamed from: ۥً */
    public final AtomicLong f17269;

    /* JADX INFO: renamed from: ۥَ */
    public final CopyOnWriteArraySet f17270;

    /* JADX INFO: renamed from: ۥْ */
    public C3183 f17271;

    /* JADX INFO: renamed from: ۥٓ */
    public C4898 f17272;

    /* JADX INFO: renamed from: ۥٕ */
    public final C3743 f17273;

    /* JADX INFO: renamed from: ۥٖ */
    public boolean f17274;

    /* JADX INFO: renamed from: ۥٙ */
    public C0826 f17275;

    /* JADX INFO: renamed from: ۥۖ */
    public boolean f17276;

    /* JADX INFO: renamed from: ۥۙ */
    public boolean f17277;

    /* JADX INFO: renamed from: ۥۦ */
    public C0826 f17278;

    /* JADX INFO: renamed from: ۥۧ */
    public C5211 f17279;

    /* JADX INFO: renamed from: ۦؖ */
    public SharedPreferencesOnSharedPreferenceChangeListenerC3764 f17280;

    /* JADX INFO: renamed from: ۦؗ */
    public final C2391 f17281;

    /* JADX INFO: renamed from: ۦؙ */
    public C0826 f17282;

    /* JADX INFO: renamed from: ۦٕ */
    public int f17283;

    /* JADX INFO: renamed from: ۦٗ */
    public final AtomicReference f17284;

    /* JADX INFO: renamed from: ۦٚ */
    public long f17285;

    /* JADX INFO: renamed from: ۦۛ */
    public final Object f17286;

    public C5235(C5371 c5371) {
        super(c5371);
        this.f17270 = new CopyOnWriteArraySet();
        this.f17286 = new Object();
        this.f17276 = false;
        this.f17283 = 1;
        this.f17277 = true;
        this.f17281 = new C2391(11, this);
        this.f17284 = new AtomicReference();
        this.f17279 = C5211.f17218;
        this.f17285 = -1L;
        this.f17269 = new AtomicLong(0L);
        this.f17273 = new C3743(8, c5371);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX INFO: renamed from: ۥؓ */
    public final void m8863(String str, String str2, Object obj, boolean z, long j) {
        int iM3239;
        int length;
        C5371 c5371 = (C5371) this.f18660;
        if (z) {
            C1512 c1512 = c5371.f17721;
            C5371.m9021(c1512);
            iM3239 = c1512.m3239(str2);
        } else {
            C1512 c1513 = c5371.f17721;
            C5371.m9021(c1513);
            if (!c1513.m3221("user property", str2)) {
                iM3239 = 6;
            } else if (c1513.m3234("user property", AbstractC1434.f4918, null, str2)) {
                C0515 c0515 = ((C5371) c1513.f18660).f17715;
                if (c1513.m3245(24, "user property", str2)) {
                    iM3239 = 0;
                } else {
                    iM3239 = 6;
                }
            } else {
                iM3239 = 15;
            }
        }
        C2391 c2391 = this.f17281;
        if (iM3239 != 0) {
            C5371.m9021(c5371.f17721);
            String strM3198 = C1512.m3198(24, str2, true);
            length = str2 != null ? str2.length() : 0;
            C5371.m9021(c5371.f17721);
            C1512.m3191(c2391, null, iM3239, "_ev", strM3198, length);
            return;
        }
        String str3 = str == null ? "app" : str;
        if (obj == null) {
            C3644 c3644 = c5371.f17733;
            C5371.m9020(c3644);
            c3644.m6515(new RunnableC3883(this, str3, str2, null, j, 1));
            return;
        }
        C1512 c1514 = c5371.f17721;
        C1512 c1515 = c5371.f17721;
        C5371.m9021(c1514);
        int iM3220 = c1514.m3220(obj, str2);
        if (iM3220 != 0) {
            C5371.m9021(c1515);
            String strM3199 = C1512.m3198(24, str2, true);
            length = ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0;
            C5371.m9021(c1515);
            C1512.m3191(c2391, null, iM3220, "_ev", strM3199, length);
            return;
        }
        C5371.m9021(c1515);
        Object objM3232 = c1515.m3232(obj, str2);
        if (objM3232 != null) {
            C3644 c3645 = c5371.f17733;
            C5371.m9020(c3645);
            c3645.m6515(new RunnableC3883(this, str3, str2, objM3232, j, 1));
        }
    }

    /* JADX INFO: renamed from: ۥؔ */
    public final void m8864(C5211 c5211, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        C5211 c5212;
        m7643();
        int i = c5211.f17219;
        if (i != -10) {
            EnumC3687 enumC3687 = (EnumC3687) c5211.f17220.get(EnumC4635.f15302);
            if (enumC3687 == null) {
                enumC3687 = EnumC3687.f12307;
            }
            EnumC3687 enumC3688 = EnumC3687.f12307;
            if (enumC3687 == enumC3688) {
                EnumC3687 enumC3689 = (EnumC3687) c5211.f17220.get(EnumC4635.f15299);
                if (enumC3689 == null) {
                    enumC3689 = enumC3688;
                }
                if (enumC3689 == enumC3688) {
                    C3610 c3610 = ((C5371) this.f18660).f17717;
                    C5371.m9020(c3610);
                    c3610.f12021.m9432("Ignoring empty consent settings");
                    return;
                }
            }
        }
        synchronized (this.f17286) {
            try {
                z2 = false;
                if (C5211.m8812(i, this.f17279.f17219)) {
                    C5211 c5213 = this.f17279;
                    EnumMap enumMap = c5211.f17220;
                    EnumC4635[] enumC4635Arr = (EnumC4635[]) enumMap.keySet().toArray(new EnumC4635[0]);
                    int length = enumC4635Arr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z3 = false;
                            break;
                        }
                        EnumC4635 enumC4635 = enumC4635Arr[i2];
                        EnumC3687 enumC36810 = (EnumC3687) enumMap.get(enumC4635);
                        EnumC3687 enumC36811 = (EnumC3687) c5213.f17220.get(enumC4635);
                        EnumC3687 enumC36812 = EnumC3687.f12305;
                        if (enumC36810 == enumC36812 && enumC36811 != enumC36812) {
                            z3 = true;
                            break;
                        }
                        i2++;
                    }
                    EnumC4635 enumC4636 = EnumC4635.f15299;
                    if (c5211.m8815(enumC4636) && !this.f17279.m8815(enumC4636)) {
                        z2 = true;
                    }
                    c5211 = c5211.m8816(this.f17279);
                    this.f17279 = c5211;
                    z4 = z2;
                    z2 = true;
                } else {
                    z3 = false;
                    z4 = false;
                }
                c5212 = c5211;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2) {
            C3610 c3611 = ((C5371) this.f18660).f17717;
            C5371.m9020(c3611);
            c3611.f12016.m9430(c5212, "Ignoring lower-priority consent settings, proposed settings");
            return;
        }
        long andIncrement = this.f17269.getAndIncrement();
        if (z3) {
            this.f17284.set(null);
            RunnableC1536 runnableC1536 = new RunnableC1536(this, c5212, andIncrement, z4, 0);
            if (z) {
                mo6517();
                runnableC1536.run();
                return;
            } else {
                C3644 c3644 = ((C5371) this.f18660).f17733;
                C5371.m9020(c3644);
                c3644.m6520(runnableC1536);
                return;
            }
        }
        RunnableC1536 runnableC1537 = new RunnableC1536(this, c5212, andIncrement, z4, 1);
        if (z) {
            mo6517();
            runnableC1537.run();
        } else if (i == 30 || i == -10) {
            C3644 c3645 = ((C5371) this.f18660).f17733;
            C5371.m9020(c3645);
            c3645.m6520(runnableC1537);
        } else {
            C3644 c3646 = ((C5371) this.f18660).f17733;
            C5371.m9020(c3646);
            c3646.m6515(runnableC1537);
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x013a  */
    /* JADX WARN: Code duplicated, block: B:60:0x0152  */
    /* JADX WARN: Code duplicated, block: B:61:0x0157  */
    /* JADX INFO: renamed from: ۥؖ */
    public final void m8865(String str, String str2, long j, long j2, Bundle bundle, boolean z, boolean z2, boolean z3) {
        String str3;
        C4474 c4474;
        C2391 c2391;
        boolean z4;
        C5266 c5266;
        long j3;
        boolean zM8175;
        int i;
        C4423 c4423;
        long j4;
        int i2;
        long j5;
        C4423 c4424;
        boolean zM9083;
        ArrayList arrayList;
        Bundle[] bundleArr;
        int i3;
        int length;
        String str4 = str;
        AbstractC0487.m1090(str4);
        AbstractC0487.m1047(bundle);
        mo6517();
        m7643();
        C5371 c5371 = (C5371) this.f18660;
        boolean zM9024 = c5371.m9024();
        C4423 c4425 = c5371.f17735;
        C0515 c0515 = c5371.f17715;
        Context context = c5371.f17739;
        C1512 c1512 = c5371.f17721;
        C3610 c3610 = c5371.f17717;
        if (!zM9024) {
            C5371.m9020(c3610);
            c3610.f12015.m9432("Event not sent since app measurement is disabled");
            return;
        }
        List list = c5371.m9029().f6511;
        if (list != null && !list.contains(str2)) {
            C5371.m9020(c3610);
            c3610.f12015.m9434(str2, str4, "Dropping non-safelisted event. event name, origin");
            return;
        }
        if (!this.f17274) {
            this.f17274 = true;
            try {
                try {
                    (!c5371.f17737 ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, context.getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, context);
                } catch (Exception e) {
                    C5371.m9020(c3610);
                    c3610.f12022.m9430(e, "Failed to invoke Tag Manager's initialize() method");
                }
            } catch (ClassNotFoundException unused) {
                C5371.m9020(c3610);
                c3610.f12016.m9432("Tag Manager is not found and thus will not be used");
            }
        }
        C4004 c4004 = c5371.f17731;
        C4474 c4475 = c5371.f17713;
        C1397 c1397 = c5371.f17719;
        if (!c0515.m1162(null, AbstractC4936.f19572) && "_cmp".equals(str2) && bundle.containsKey("gclid")) {
            String string = bundle.getString("gclid");
            c1397.getClass();
            str3 = null;
            m8874(System.currentTimeMillis(), string, "auto", "_lgclid");
        } else {
            str3 = null;
        }
        if (!z || C1512.f5130[0].equals(str2)) {
            c4474 = c4475;
        } else {
            C5371.m9021(c1512);
            C5371.m9021(c4475);
            c4474 = c4475;
            c1512.m3236(bundle, c4474.f14752.m3130());
        }
        C2391 c2392 = this.f17281;
        if (z3 || "_iap".equals(str2)) {
            c2391 = c2392;
        } else {
            C5371.m9021(c1512);
            int i4 = 2;
            if (c1512.m3221("event", str2)) {
                c2391 = c2392;
                if (c1512.m3234("event", AbstractC1605.f5396, ((C5371) c1512.f18660).f17715.m1162(str3, AbstractC4936.f19563) ? AbstractC1605.f5393 : AbstractC1605.f5392, str2)) {
                    i3 = 40;
                    if (c1512.m3245(40, "event", str2)) {
                        i4 = 0;
                    }
                } else {
                    i4 = 13;
                }
                if (i4 != 0) {
                    C5371.m9020(c3610);
                    c3610.f12026.m9430(c4004.m7146(str2), "Invalid public event name. Event will not be logged (FE)");
                    C5371.m9021(c1512);
                    String strM3198 = C1512.m3198(i3, str2, true);
                    if (str2 != null) {
                        length = str2.length();
                    } else {
                        length = 0;
                    }
                    C1512.m3191(c2391, null, i4, "_ev", strM3198, length);
                    return;
                }
            } else {
                c2391 = c2392;
            }
            i3 = 40;
            if (i4 != 0) {
                C5371.m9020(c3610);
                c3610.f12026.m9430(c4004.m7146(str2), "Invalid public event name. Event will not be logged (FE)");
                C5371.m9021(c1512);
                String strM3199 = C1512.m3198(i3, str2, true);
                if (str2 != null) {
                    length = str2.length();
                } else {
                    length = 0;
                }
                C1512.m3191(c2391, null, i4, "_ev", strM3199, length);
                return;
            }
        }
        C5266 c5267 = c5371.f17711;
        C5371.m9023(c5267);
        C0932 c0932M8902 = c5267.m8902(false);
        if (c0932M8902 != null && !bundle.containsKey("_sc")) {
            c0932M8902.f3321 = true;
        }
        C1512.m3193(c0932M8902, bundle, z && !z3);
        boolean zEquals = "am".equals(str4);
        boolean zM3188 = C1512.m3188(str2);
        if (!z || this.f17272 == null || zM3188) {
            z4 = zEquals;
        } else {
            if (!zEquals) {
                C5371.m9020(c3610);
                c3610.f12015.m9434(c4004.m7146(str2), c4004.m7143(bundle), "Passing event to registered event handler (FE)");
                AbstractC0487.m1047(this.f17272);
                C4898 c4898 = this.f17272;
                c4898.getClass();
                try {
                    ((InterfaceC0257) c4898.f16143).mo538(str4, str2, bundle, j);
                    return;
                } catch (RemoteException e2) {
                    C5371 c5372 = ((AppMeasurementDynamiteService) c4898.f16142).f309;
                    if (c5372 != null) {
                        C3610 c3611 = c5372.f17717;
                        C5371.m9020(c3611);
                        c3611.f12022.m9430(e2, "Event interceptor threw exception");
                        return;
                    }
                    return;
                }
            }
            z4 = true;
        }
        if (c5371.m9025()) {
            C5371.m9021(c1512);
            C5371 c5373 = (C5371) c1512.f18660;
            int iM3229 = c1512.m3229(str2);
            if (iM3229 != 0) {
                C5371.m9020(c3610);
                c3610.f12026.m9430(c4004.m7146(str2), "Invalid event name. Event will not be logged (FE)");
                String strM31910 = C1512.m3198(40, str2, true);
                int length2 = str2 != null ? str2.length() : 0;
                C5371.m9021(c1512);
                C1512.m3191(c2391, null, iM3229, "_ev", strM31910, length2);
                return;
            }
            Bundle bundleM3202 = c1512.m3202(str2, bundle, AbstractC2776.m5231("_o", "_sn", "_sc", "_si"), z3);
            AbstractC0487.m1047(bundleM3202);
            C5371.m9023(c5267);
            String str5 = "_o";
            if (c5267.m8902(false) == null || !"_ae".equals(str2)) {
                c5266 = c5267;
                j3 = 0;
            } else {
                C5371.m9023(c4425);
                C0616 c0616 = c4425.f14593;
                ((C5371) c0616.f2301.f18660).f17719.getClass();
                j3 = 0;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                c5266 = c5267;
                long j6 = jElapsedRealtime - c0616.f2299;
                c0616.f2299 = jElapsedRealtime;
                if (j6 > 0) {
                    c1512.m3209(bundleM3202, j6);
                }
            }
            if (!"auto".equals(str4) && "_ssr".equals(str2)) {
                String string2 = bundleM3202.getString("_ffr");
                int i5 = AbstractC3660.f12253;
                if (string2 == null || string2.trim().isEmpty()) {
                    string2 = null;
                } else if (string2 != null) {
                    string2 = string2.trim();
                }
                C4474 c4476 = c5373.f17713;
                C5371.m9021(c4476);
                if (Objects.equals(string2, c4476.f14766.m2974())) {
                    C3610 c3612 = c5373.f17717;
                    C5371.m9020(c3612);
                    c3612.f12015.m9432("Not logging duplicate session_start_with_rollout event");
                    return;
                } else {
                    C4474 c4477 = c5373.f17713;
                    C5371.m9021(c4477);
                    c4477.f14766.m2971(string2);
                }
            } else if ("_ae".equals(str2)) {
                C4474 c4478 = c5373.f17713;
                C5371.m9021(c4478);
                String strM2974 = c4478.f14766.m2974();
                if (!TextUtils.isEmpty(strM2974)) {
                    bundleM3202.putString("_ffr", strM2974);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(bundleM3202);
            if (c0515.m1162(null, AbstractC4936.f16330)) {
                C5371.m9023(c4425);
                c4425.mo6517();
                zM8175 = c4425.f14592;
            } else {
                C5371.m9021(c4474);
                zM8175 = c4474.f14767.m8175();
            }
            C5371.m9021(c4474);
            if (c4474.f14772.m7371() > j3) {
                c4423 = c4425;
                j5 = j;
                if (c4474.m7751(j5) && zM8175) {
                    C5371.m9020(c3610);
                    c3610.f12023.m9432("Current session is expired, remove the session number, ID, and engagement time");
                    c1397.getClass();
                    i = 1;
                    i2 = 0;
                    m8874(System.currentTimeMillis(), null, "auto", "_sid");
                    m8874(System.currentTimeMillis(), null, "auto", "_sno");
                    m8874(System.currentTimeMillis(), null, "auto", "_se");
                    j4 = j3;
                    c4474.f14758.m7370(j4);
                } else {
                    i = 1;
                    j4 = j3;
                    i2 = 0;
                }
            } else {
                i = 1;
                c4423 = c4425;
                j4 = j3;
                i2 = 0;
                j5 = j;
            }
            if (bundleM3202.getLong("extend_session", j4) == 1) {
                C5371.m9020(c3610);
                c3610.f12023.m9432("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                C5371.m9023(c4423);
                c4424 = c4423;
                c4424.f14590.m6580(j5, j2);
            } else {
                c4424 = c4423;
            }
            ArrayList arrayList3 = new ArrayList(bundleM3202.keySet());
            Collections.sort(arrayList3);
            int size = arrayList3.size();
            int i6 = i2;
            while (i6 < size) {
                String str6 = (String) arrayList3.get(i6);
                if (str6 != null) {
                    C5371.m9021(c1512);
                    Object obj = bundleM3202.get(str6);
                    arrayList = arrayList3;
                    if (obj instanceof Bundle) {
                        bundleArr = new Bundle[i];
                        bundleArr[i2] = (Bundle) obj;
                    } else if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList4 = (ArrayList) obj;
                        bundleArr = (Bundle[]) arrayList4.toArray(new Bundle[arrayList4.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        bundleM3202.putParcelableArray(str6, bundleArr);
                    }
                } else {
                    arrayList = arrayList3;
                }
                i6++;
                arrayList3 = arrayList;
                i = 1;
            }
            int i7 = i2;
            while (i7 < arrayList2.size()) {
                Bundle bundleM3205 = (Bundle) arrayList2.get(i7);
                String str7 = i7 != 0 ? "_ep" : str2;
                String str8 = str5;
                bundleM3205.putString(str8, str4);
                if (z2) {
                    bundleM3205 = c1512.m3205(bundleM3205);
                }
                Bundle bundle2 = bundleM3205;
                C2679 c2679 = new C2679(str7, new C5645(bundleM3205), str4, j5, j2);
                C5695 c5695M9028 = c5371.m9028();
                c5695M9028.getClass();
                c5695M9028.mo6517();
                c5695M9028.m7643();
                c5695M9028.m9508();
                C5403 c5403M9026 = ((C5371) c5695M9028.f18660).m9026();
                c5403M9026.getClass();
                Parcel parcelObtain = Parcel.obtain();
                C5229.m8859(c2679, parcelObtain, i2);
                byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                if (bArrMarshall.length > 131072) {
                    C3610 c3613 = ((C5371) c5403M9026.f18660).f17717;
                    C5371.m9020(c3613);
                    c3613.f12025.m9432("Event is too long for local database. Sending event directly to service");
                    zM9083 = false;
                } else {
                    zM9083 = c5403M9026.m9083(0, bArrMarshall);
                }
                c5695M9028.m9509(new RunnableC5642(c5695M9028, c5695M9028.m9517(true), zM9083, c2679, 1));
                if (!z4) {
                    Iterator it = this.f17270.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC4264) it.next()).mo4010(str, str2, new Bundle(bundle2), j);
                    }
                }
                i7++;
                str4 = str;
                j5 = j;
                str5 = str8;
                i2 = 0;
            }
            C5371.m9023(c5266);
            if (c5266.m8902(false) == null || !"_ae".equals(str2)) {
                return;
            }
            C5371.m9023(c4424);
            c1397.getClass();
            c4424.f14593.m1382(true, true, SystemClock.elapsedRealtime());
        }
    }

    /* JADX INFO: renamed from: ۥً */
    public final void m8866() {
        mo6517();
        m7643();
        C5371 c5371 = (C5371) this.f18660;
        if (c5371.m9025()) {
            C0515 c0515 = c5371.f17715;
            ((C5371) c0515.f18660).getClass();
            Boolean boolM1166 = c0515.m1166("google_analytics_deferred_deep_link_enabled");
            if (boolM1166 != null && boolM1166.booleanValue()) {
                C3610 c3610 = c5371.f17717;
                C5371.m9020(c3610);
                c3610.f12015.m9432("Deferred Deep Link feature enabled.");
                C3644 c3644 = c5371.f17733;
                C5371.m9020(c3644);
                c3644.m6515(new RunnableC3148(this, 2));
            }
            C5695 c5695M9028 = c5371.m9028();
            c5695M9028.mo6517();
            c5695M9028.m7643();
            C5855 c5855M9517 = c5695M9028.m9517(true);
            c5695M9028.m9508();
            C5371 c5372 = (C5371) c5695M9028.f18660;
            c5372.f17715.m1162(null, AbstractC4936.f19569);
            c5372.m9026().m9083(3, new byte[0]);
            c5695M9028.m9509(new RunnableC4292(c5695M9028, c5855M9517, 1));
            this.f17277 = false;
            C4474 c4474 = c5371.f17713;
            C5371.m9021(c4474);
            c4474.mo6517();
            String string = c4474.m7755().getString("previous_os_version", null);
            ((C5371) c4474.f18660).m9030().m503();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = c4474.m7755().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            c5371.m9030().m503();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            m8879("auto", "_ou", bundle);
        }
    }

    /* JADX INFO: renamed from: ۥٕ */
    public final void m8867(String str, String str2, Bundle bundle) {
        C5371 c5371 = (C5371) this.f18660;
        c5371.f17719.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        AbstractC0487.m1090(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        C3644 c3644 = c5371.f17733;
        C5371.m9020(c3644);
        c3644.m6515(new RunnableC4108(this, bundle2, 1));
    }

    @Override // p000.AbstractC4351
    /* JADX INFO: renamed from: ۥٖ */
    public final boolean mo3853() {
        return false;
    }

    /* JADX INFO: renamed from: ۥ٘ */
    public final void m8868() {
        C4012 c4012;
        mo6517();
        if (m8885().isEmpty() || this.f17276 || (c4012 = (C4012) m8885().poll()) == null) {
            return;
        }
        C5371 c5371 = (C5371) this.f18660;
        C1512 c1512 = c5371.f17721;
        C5371.m9021(c1512);
        C5424 c5424M3203 = c1512.m3203();
        if (c5424M3203 != null) {
            this.f17276 = true;
            C3610 c3610 = c5371.f17717;
            C5371.m9020(c3610);
            C5590 c5590 = c3610.f12023;
            String str = c4012.f13379;
            c5590.m9430(str, "Registering trigger URI");
            InterfaceFutureC4378 interfaceFutureC4378M9095 = c5424M3203.m9095(Uri.parse(str));
            boolean z = false;
            byte b = 0;
            if (interfaceFutureC4378M9095 != null) {
                interfaceFutureC4378M9095.mo3760(new RunnableC4985(b == true ? 1 : 0, interfaceFutureC4378M9095, new C2346(25, this, c4012, z)), new ExecutorC0170(3, this));
            } else {
                this.f17276 = false;
                m8885().add(c4012);
            }
        }
    }

    /* JADX INFO: renamed from: ۥٙ */
    public final void m8869(long j, long j2, Bundle bundle, String str, String str2) {
        mo6517();
        boolean z = true;
        if (this.f17272 != null && !C1512.m3188(str2)) {
            z = false;
        }
        m8865(str, str2, j, j2, bundle, true, z, true);
    }

    /* JADX INFO: renamed from: ۥٛ */
    public final void m8870(C5211 c5211) {
        mo6517();
        boolean z = (c5211.m8815(EnumC4635.f15299) && c5211.m8815(EnumC4635.f15302)) || ((C5371) this.f18660).m9028().m9507();
        C5371 c5371 = (C5371) this.f18660;
        C3644 c3644 = c5371.f17733;
        C5371.m9020(c3644);
        c3644.mo6517();
        if (z != c5371.f17736) {
            C3644 c3645 = c5371.f17733;
            C5371.m9020(c3645);
            c3645.mo6517();
            c5371.f17736 = z;
            C4474 c4474 = ((C5371) this.f18660).f17713;
            C5371.m9021(c4474);
            c4474.mo6517();
            Boolean boolValueOf = c4474.m7755().contains("measurement_enabled_from_api") ? Boolean.valueOf(c4474.m7755().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || boolValueOf == null || boolValueOf.booleanValue()) {
                m8875(Boolean.valueOf(z), false);
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v11 ??, still in use, count: 1, list:
          (r14v11 ?? I:??[OBJECT, ARRAY]) from 0x0501: INVOKE (r2v9 ?? I:int) = (r14v11 ?? I:??[OBJECT, ARRAY]) VIRTUAL call: ￛﾦￛﾗ￘ﾕ￘ﾙￛﾨ.ￛﾥ￘ﾗ():int A[MD:():int (m)] (LINE:1282)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* JADX INFO: renamed from: ۥۖ */
    public final void m8871() {
        /*
            Method dump skipped, instruction units count: 1360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C5235.m8871():void");
    }

    /* JADX INFO: renamed from: ۥۙ */
    public final String m8872() {
        C5371 c5371 = (C5371) this.f18660;
        try {
            return AbstractC0949.m1934(c5371.f17739, c5371.f17734);
        } catch (IllegalStateException e) {
            C3610 c3610 = c5371.f17717;
            C5371.m9020(c3610);
            c3610.f12020.m9430(e, "getGoogleAppId failed with exception");
            return null;
        }
    }

    /* JADX INFO: renamed from: ۥۦ */
    public final void m8873() {
        mo6517();
        C5371 c5371 = (C5371) this.f18660;
        C4474 c4474 = c5371.f17713;
        C3610 c3610 = c5371.f17717;
        C1397 c1397 = c5371.f17719;
        C5371.m9021(c4474);
        String strM2974 = c4474.f14751.m2974();
        int i = 1;
        if (strM2974 != null) {
            if ("unset".equals(strM2974)) {
                c1397.getClass();
                m8874(System.currentTimeMillis(), null, "app", "_npa");
            } else {
                Long lValueOf = Long.valueOf(true != "true".equals(strM2974) ? 0L : 1L);
                c1397.getClass();
                m8874(System.currentTimeMillis(), lValueOf, "app", "_npa");
            }
        }
        if (!c5371.m9024() || !this.f17277) {
            C5371.m9020(c3610);
            c3610.f12015.m9432("Updating Scion state (FE)");
            C5695 c5695M9028 = c5371.m9028();
            c5695M9028.mo6517();
            c5695M9028.m7643();
            c5695M9028.m9509(new RunnableC4292(c5695M9028, c5695M9028.m9517(true), 3));
            return;
        }
        C5371.m9020(c3610);
        c3610.f12015.m9432("Recording app launch after enabling measurement for the first time (FE)");
        m8866();
        C4423 c4423 = c5371.f17735;
        C5371.m9023(c4423);
        c4423.f14590.m6584();
        C3644 c3644 = c5371.f17733;
        C5371.m9020(c3644);
        c3644.m6515(new RunnableC3148(this, i));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0057  */
    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX INFO: renamed from: ۥۧ */
    public final void m8874(long j, Object obj, String str, String str2) {
        String str3;
        boolean zM9083;
        Object objValueOf = obj;
        C5371 c5371 = (C5371) this.f18660;
        AbstractC0487.m1090(str);
        AbstractC0487.m1090(str2);
        mo6517();
        m7643();
        if ("allow_personalized_ads".equals(str2)) {
            String str4 = "_npa";
            if (objValueOf instanceof String) {
                String str5 = (String) objValueOf;
                if (!TextUtils.isEmpty(str5)) {
                    long j2 = true != "false".equals(str5.toLowerCase(Locale.ENGLISH)) ? 0L : 1L;
                    objValueOf = Long.valueOf(j2);
                    C4474 c4474 = c5371.f17713;
                    C5371.m9021(c4474);
                    c4474.f14751.m2971(j2 == 1 ? "true" : "false");
                } else if (objValueOf == null) {
                    C4474 c4475 = c5371.f17713;
                    C5371.m9021(c4475);
                    c4475.f14751.m2971("unset");
                } else {
                    str4 = str2;
                }
            } else if (objValueOf == null) {
                C4474 c4476 = c5371.f17713;
                C5371.m9021(c4476);
                c4476.f14751.m2971("unset");
            } else {
                str4 = str2;
            }
            C3610 c3610 = c5371.f17717;
            C5371.m9020(c3610);
            c3610.f12023.m9434("non_personalized_ads(_npa)", objValueOf, "Setting user property(FE)");
            str3 = str4;
        } else {
            str3 = str2;
        }
        Object obj2 = objValueOf;
        if (!c5371.m9024()) {
            C3610 c3611 = c5371.f17717;
            C5371.m9020(c3611);
            c3611.f12023.m9432("User property not set since app measurement is disabled");
            return;
        }
        if (c5371.m9025()) {
            C1477 c1477 = new C1477(j, obj2, str3, str);
            C5695 c5695M9028 = c5371.m9028();
            c5695M9028.mo6517();
            c5695M9028.m7643();
            c5695M9028.m9508();
            C5403 c5403M9026 = ((C5371) c5695M9028.f18660).m9026();
            c5403M9026.getClass();
            Parcel parcelObtain = Parcel.obtain();
            C5229.m8858(c1477, parcelObtain);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            if (bArrMarshall.length > 131072) {
                C3610 c3612 = ((C5371) c5403M9026.f18660).f17717;
                C5371.m9020(c3612);
                c3612.f12025.m9432("User property too long for local database. Sending directly to service");
                zM9083 = false;
            } else {
                zM9083 = c5403M9026.m9083(1, bArrMarshall);
            }
            c5695M9028.m9509(new RunnableC5642(c5695M9028, c5695M9028.m9517(true), zM9083, c1477, 0));
        }
    }

    /* JADX INFO: renamed from: ۦؖ */
    public final void m8875(Boolean bool, boolean z) {
        mo6517();
        m7643();
        C5371 c5371 = (C5371) this.f18660;
        C3610 c3610 = c5371.f17717;
        C5371.m9020(c3610);
        c3610.f12015.m9430(bool, "Setting app measurement enabled (FE)");
        C4474 c4474 = c5371.f17713;
        C5371.m9021(c4474);
        c4474.mo6517();
        SharedPreferences.Editor editorEdit = c4474.m7755().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
        if (z) {
            c4474.mo6517();
            SharedPreferences.Editor editorEdit2 = c4474.m7755().edit();
            if (bool != null) {
                editorEdit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit2.remove("measurement_enabled_from_api");
            }
            editorEdit2.apply();
        }
        C3644 c3644 = c5371.f17733;
        C5371.m9020(c3644);
        c3644.mo6517();
        if (c5371.f17736 || !(bool == null || bool.booleanValue())) {
            m8873();
        }
    }

    /* JADX INFO: renamed from: ۦؗ */
    public final void m8876() {
        C5371 c5371 = (C5371) this.f18660;
        if (!(c5371.f17739.getApplicationContext() instanceof Application) || this.f17271 == null) {
            return;
        }
        ((Application) c5371.f17739.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f17271);
    }

    /* JADX INFO: renamed from: ۦؙ */
    public final void m8877(C5211 c5211, long j, boolean z) {
        int i = c5211.f17219;
        mo6517();
        m7643();
        C5371 c5371 = (C5371) this.f18660;
        C4474 c4474 = c5371.f17713;
        C3610 c3610 = c5371.f17717;
        C5371.m9021(c4474);
        C5211 c5211M7754 = c4474.m7754();
        if (j <= this.f17285 && C5211.m8812(c5211M7754.f17219, i)) {
            C5371.m9020(c3610);
            c3610.f12016.m9430(c5211, "Dropped out-of-date consent setting, proposed settings");
            return;
        }
        C4474 c4475 = c5371.f17713;
        C5371.m9021(c4475);
        c4475.mo6517();
        if (!C5211.m8812(i, c4475.m7755().getInt("consent_source", 100))) {
            C5371.m9020(c3610);
            c3610.f12016.m9430(Integer.valueOf(i), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor editorEdit = c4475.m7755().edit();
        editorEdit.putString("consent_settings", c5211.m8817());
        editorEdit.putInt("consent_source", i);
        editorEdit.apply();
        C5371.m9020(c3610);
        c3610.f12023.m9430(c5211, "Setting storage consent(FE)");
        this.f17285 = j;
        if (c5371.m9028().m9506()) {
            C5695 c5695M9028 = c5371.m9028();
            c5695M9028.mo6517();
            c5695M9028.m7643();
            c5695M9028.m9509(new RunnableC3936(c5695M9028, 2));
        } else {
            C5695 c5695M9029 = c5371.m9028();
            c5695M9029.mo6517();
            c5695M9029.m7643();
            if (c5695M9029.m9507()) {
                c5695M9029.m9509(new RunnableC4292(c5695M9029, c5695M9029.m9517(false)));
            }
        }
        if (z) {
            c5371.m9028().m9519(new AtomicReference());
        }
    }

    /* JADX INFO: renamed from: ۦُ */
    public final void m8878(Bundle bundle, int i, long j) {
        Boolean bool;
        String string;
        EnumC3687 enumC3687;
        Boolean bool2;
        C5371 c5371 = (C5371) this.f18660;
        m7643();
        C5211 c5211 = C5211.f17218;
        EnumC4635[] enumC4635Arr = EnumC0998.STORAGE.f3575;
        int length = enumC4635Arr.length;
        int i2 = 0;
        while (true) {
            bool = null;
            if (i2 >= length) {
                string = null;
                break;
            }
            String str = enumC4635Arr[i2].f15303;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                if (string.equals("granted")) {
                    bool2 = Boolean.TRUE;
                } else {
                    bool2 = string.equals("denied") ? Boolean.FALSE : null;
                }
                if (bool2 == null) {
                    break;
                }
            }
            i2++;
        }
        if (string != null) {
            C3610 c3610 = c5371.f17717;
            C5371.m9020(c3610);
            c3610.f12021.m9430(string, "Ignoring invalid consent setting");
            C3610 c3611 = c5371.f17717;
            C5371.m9020(c3611);
            c3611.f12021.m9432("Valid consent values are 'granted', 'denied'");
        }
        C3644 c3644 = c5371.f17733;
        C5371.m9020(c3644);
        boolean zM6519 = c3644.m6519();
        C5211 c5211M8808 = C5211.m8808(i, bundle);
        Iterator it = c5211M8808.f17220.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            enumC3687 = EnumC3687.f12307;
            if (!zHasNext) {
                break;
            } else if (((EnumC3687) it.next()) != enumC3687) {
                m8864(c5211M8808, zM6519);
                break;
            }
        }
        C5800 c5800M9609 = C5800.m9609(i, bundle);
        Iterator it2 = c5800M9609.f19113.values().iterator();
        while (it2.hasNext()) {
            if (((EnumC3687) it2.next()) != enumC3687) {
                m8880(c5800M9609, zM6519);
                break;
            }
        }
        if (bundle != null) {
            int iOrdinal = C5211.m8811(bundle.getString("ad_personalization")).ordinal();
            if (iOrdinal == 2) {
                bool = Boolean.FALSE;
            } else if (iOrdinal == 3) {
                bool = Boolean.TRUE;
            }
        }
        if (bool != null) {
            String str2 = i == -30 ? "tcf" : "app";
            if (zM6519) {
                m8874(j, bool.toString(), str2, "allow_personalized_ads");
            } else {
                m8863(str2, "allow_personalized_ads", bool.toString(), false, j);
            }
        }
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final void m8879(String str, String str2, Bundle bundle) {
        long jElapsedRealtime;
        mo6517();
        C5371 c5371 = (C5371) this.f18660;
        c5371.f17719.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c5371.f17715.m1162(null, AbstractC4936.f19565)) {
            c5371.f17719.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else {
            jElapsedRealtime = 0;
        }
        m8869(jCurrentTimeMillis, jElapsedRealtime, bundle, str, str2);
    }

    /* JADX INFO: renamed from: ۦٖ */
    public final void m8880(C5800 c5800, boolean z) {
        RunnableC4985 runnableC4985 = new RunnableC4985(28, this, c5800, false);
        if (z) {
            mo6517();
            runnableC4985.run();
        } else {
            C3644 c3644 = ((C5371) this.f18660).f17733;
            C5371.m9020(c3644);
            c3644.m6515(runnableC4985);
        }
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final void m8881(String str, String str2, Bundle bundle) {
        long jElapsedRealtime;
        C5371 c5371 = (C5371) this.f18660;
        c5371.f17719.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c5371.f17715.m1162(null, AbstractC4936.f19565)) {
            c5371.f17719.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else {
            jElapsedRealtime = 0;
        }
        m8883(str, str2, bundle, true, true, jCurrentTimeMillis, jElapsedRealtime);
    }

    /* JADX INFO: renamed from: ۦٚ */
    public final void m8882(Bundle bundle, long j) {
        C5371 c5371 = (C5371) this.f18660;
        AbstractC0487.m1047(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            C3610 c3610 = c5371.f17717;
            C5371.m9020(c3610);
            c3610.f12022.m9432("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        AbstractC1434.m3062(bundle2, "app_id", String.class, null);
        AbstractC1434.m3062(bundle2, "origin", String.class, null);
        AbstractC1434.m3062(bundle2, "name", String.class, null);
        AbstractC1434.m3062(bundle2, "value", Object.class, null);
        AbstractC1434.m3062(bundle2, "trigger_event_name", String.class, null);
        AbstractC1434.m3062(bundle2, "trigger_timeout", Long.class, 0L);
        AbstractC1434.m3062(bundle2, "timed_out_event_name", String.class, null);
        AbstractC1434.m3062(bundle2, "timed_out_event_params", Bundle.class, null);
        AbstractC1434.m3062(bundle2, "triggered_event_name", String.class, null);
        AbstractC1434.m3062(bundle2, "triggered_event_params", Bundle.class, null);
        AbstractC1434.m3062(bundle2, "time_to_live", Long.class, 0L);
        AbstractC1434.m3062(bundle2, "expired_event_name", String.class, null);
        AbstractC1434.m3062(bundle2, "expired_event_params", Bundle.class, null);
        AbstractC0487.m1090(bundle2.getString("name"));
        AbstractC0487.m1090(bundle2.getString("origin"));
        AbstractC0487.m1047(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        C1512 c1512 = c5371.f17721;
        C4004 c4004 = c5371.f17731;
        C3610 c3611 = c5371.f17717;
        C5371.m9021(c1512);
        if (c1512.m3239(string) != 0) {
            C5371.m9020(c3611);
            c3611.f12020.m9430(c4004.m7142(string), "Invalid conditional user property name");
            return;
        }
        C5371.m9021(c1512);
        if (c1512.m3220(obj, string) != 0) {
            C5371.m9020(c3611);
            c3611.f12020.m9434(c4004.m7142(string), obj, "Invalid conditional user property value");
            return;
        }
        Object objM3232 = c1512.m3232(obj, string);
        if (objM3232 == null) {
            C5371.m9020(c3611);
            c3611.f12020.m9434(c4004.m7142(string), obj, "Unable to normalize conditional user property value");
            return;
        }
        AbstractC1434.m3060(bundle2, objM3232);
        long j2 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j2 > 15552000000L || j2 < 1)) {
            C5371.m9020(c3611);
            c3611.f12020.m9434(c4004.m7142(string), Long.valueOf(j2), "Invalid conditional user property timeout");
            return;
        }
        long j3 = bundle2.getLong("time_to_live");
        if (j3 > 15552000000L || j3 < 1) {
            C5371.m9020(c3611);
            c3611.f12020.m9434(c4004.m7142(string), Long.valueOf(j3), "Invalid conditional user property time to live");
        } else {
            C3644 c3644 = c5371.f17733;
            C5371.m9020(c3644);
            c3644.m6515(new RunnableC4108(this, bundle2, 0));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r3 > 500) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a3, code lost:
    
        if (r5 > 500) goto L36;
     */
    /* JADX INFO: renamed from: ۦۛ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m8883(java.lang.String r20, java.lang.String r21, android.os.Bundle r22, boolean r23, boolean r24, long r25, long r27) {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C5235.m8883(java.lang.String, java.lang.String, android.os.Bundle, boolean, boolean, long, long):void");
    }

    /* JADX INFO: renamed from: ۦۜ */
    public final void m8884() {
        C0237.m498();
        C5371 c5371 = (C5371) this.f18660;
        C0515 c0515 = c5371.f17715;
        C3644 c3644 = c5371.f17733;
        C3610 c3610 = c5371.f17717;
        if (c0515.m1162(null, AbstractC4936.f16258)) {
            C5371.m9020(c3644);
            if (c3644.m6519()) {
                C5371.m9020(c3610);
                c3610.f12020.m9432("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (C4452.m7739()) {
                C5371.m9020(c3610);
                c3610.f12020.m9432("Cannot get trigger URIs from main thread");
                return;
            }
            m7643();
            C5371.m9020(c3610);
            c3610.f12023.m9432("Getting trigger URIs (FE)");
            AtomicReference atomicReference = new AtomicReference();
            C5371.m9020(c3644);
            byte b = 0;
            c3644.m6514(atomicReference, 10000L, "get trigger URIs", new RunnableC3265(this, atomicReference, 5, false));
            List list = (List) atomicReference.get();
            if (list == null) {
                C5371.m9020(c3610);
                c3610.f12026.m9432("Timed out waiting for get trigger URIs");
            } else {
                C5371.m9020(c3644);
                c3644.m6515(new RunnableC5413(b == true ? 1 : 0, this, list));
            }
        }
    }

    /* JADX INFO: renamed from: ۦۣ */
    public final PriorityQueue m8885() {
        PriorityQueue priorityQueue = this.f17267;
        if (priorityQueue != null) {
            return priorityQueue;
        }
        PriorityQueue priorityQueue2 = new PriorityQueue(Comparator.comparing(C1544.f5221, C1206.f4155));
        this.f17267 = priorityQueue2;
        return priorityQueue2;
    }
}
