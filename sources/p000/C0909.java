package p000;

import android.util.Log;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: ۥٌؘؖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0909 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C3086 f3261;

    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC1015 f3262;

    /* JADX INFO: renamed from: ۥّ */
    public final C4590 f3263;

    /* JADX INFO: renamed from: ۥۗ */
    public final C1862 f3264;

    /* JADX INFO: renamed from: ۥۜ */
    public C1109 f3265;

    /* JADX INFO: renamed from: ۥۣ */
    public final C1802 f3266;

    /* JADX INFO: renamed from: ۦؑ */
    public final C3729 f3267;

    /* JADX INFO: renamed from: ۦِ */
    public boolean f3268;

    /* JADX INFO: renamed from: ۦٛ */
    public boolean f3269;

    /* JADX INFO: renamed from: ۦۗ */
    public String f3270 = "";

    /* JADX INFO: renamed from: ۦۙ */
    public final InterfaceC3534 f3271;

    public C0909(C1802 c1802, C1862 c1862, C3086 c3086, C3729 c3729, InterfaceC1015 interfaceC1015, C4590 c4590, InterfaceC3534 interfaceC3534) {
        this.f3266 = c1802;
        this.f3264 = c1862;
        this.f3261 = c3086;
        this.f3267 = c3729;
        this.f3262 = interfaceC1015;
        this.f3263 = c4590;
        this.f3271 = interfaceC3534;
        AbstractC2765.m5135(AbstractC4009.m7151(interfaceC3534), null, 0, new C1155(this, null, 0), 3);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final boolean m1889(C1109 c1109) {
        Map map = c1109.f3897;
        boolean z = true;
        C4590 c4590 = this.f3263;
        if (map == null) {
            Log.d("FirebaseSessions", "No process data for " + c4590.m7957());
            return true;
        }
        C1060 c1060 = (C1060) map.get(c4590.m7957());
        if (c1060 != null && c1060.f3738 == c4590.f15142 && AbstractC3831.m6874(c1060.f3737, (String) c4590.f15147.getValue())) {
            z = false;
        }
        if (z) {
            Log.d("FirebaseSessions", "Process " + c4590.m7957() + " is stale");
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۥُ */
    public final Object m1890(String str, EnumC4779 enumC4779, InterfaceC0443 interfaceC0443) {
        C1052 c1052;
        String str2;
        if (interfaceC0443 instanceof C1052) {
            c1052 = (C1052) interfaceC0443;
            int i = c1052.f3722;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1052.f3722 = i - Integer.MIN_VALUE;
            } else {
                c1052 = new C1052(this, interfaceC0443);
            }
        } else {
            c1052 = new C1052(this, interfaceC0443);
        }
        Object objM493 = c1052.f3720;
        EnumC2282 enumC2282 = EnumC2282.f7590;
        int i2 = c1052.f3722;
        if (i2 == 0) {
            AbstractC0186.m409(objM493);
            if (AbstractC3831.m6874(this.f3270, str)) {
                return C2358.f7817;
            }
            this.f3270 = str;
            C0230 c0230 = C0230.f872;
            c1052.f3719 = str;
            c1052.f3718 = enumC4779;
            c1052.f3722 = 1;
            objM493 = c0230.m493(c1052);
            if (objM493 == enumC2282) {
                return enumC2282;
            }
        } else {
            if (i2 != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            enumC4779 = c1052.f3718;
            str = c1052.f3719;
            AbstractC0186.m409(objM493);
        }
        for (C2702 c2702 : ((Map) objM493).values()) {
            C4180 c4180 = new C4180(str);
            c2702.getClass();
            String str3 = "App Quality Sessions session changed: " + c4180;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str3, null);
            }
            C2808 c2808 = c2702.f8960;
            synchronized (c2808) {
                if (!Objects.equals((String) c2808.f9377, str)) {
                    C2808.m5330((C2711) c2808.f9378, (String) c2808.f9376, str);
                    c2808.f9377 = str;
                }
            }
            int iOrdinal = enumC4779.ordinal();
            if (iOrdinal == 0) {
                str2 = "Notified " + EnumC1499.f5085 + " of new session " + str;
            } else {
                if (iOrdinal != 1) {
                    C1078.m2275();
                    return null;
                }
                str2 = "Notified " + EnumC1499.f5085 + " of new fallback session " + str;
            }
            Log.d("FirebaseSessions", str2);
        }
        return C2358.f7817;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m1891() {
        this.f3269 = true;
        C1109 c1109 = this.f3265;
        if (c1109 == null) {
            this.f3268 = true;
            Log.d("FirebaseSessions", "App foregrounded, but local SessionData not initialized");
            return;
        }
        Log.d("FirebaseSessions", "App foregrounded on " + this.f3263.m7957());
        if (m1893(c1109) || m1889(c1109)) {
            AbstractC2765.m5135(AbstractC4009.m7151(this.f3271), null, 0, new C5030(this, c1109, null, 16), 3);
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m1892() {
        this.f3269 = false;
        if (this.f3265 == null) {
            Log.d("FirebaseSessions", "App backgrounded, but local SessionData not initialized");
            return;
        }
        Log.d("FirebaseSessions", "App backgrounded on " + this.f3263.m7957());
        AbstractC2765.m5135(AbstractC4009.m7151(this.f3271), null, 0, new C1155(this, null, 1), 3);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0042  */
    /* JADX WARN: Code duplicated, block: B:18:0x004f  */
    /* JADX INFO: renamed from: ۦؑ */
    public final boolean m1893(C1109 c1109) {
        C5805 c5805Mo4317;
        long jM7166;
        C4959 c4959 = c1109.f3898;
        C1521 c1521 = c1109.f3899;
        if (c4959 == null) {
            Log.d("FirebaseSessions", "Session " + c1521.f5162 + " has not backgrounded yet");
            return false;
        }
        this.f3267.getClass();
        C4959 c4959M6575 = C3729.m6575();
        C4036 c4036 = C5805.f19128;
        long jM7170 = AbstractC4009.m7170(c4959M6575.f16406 - c4959.f16406, EnumC3021.MILLISECONDS);
        C1802 c1802 = this.f3266;
        C5805 c5805Mo4318 = c1802.f6003.mo4317();
        if (c5805Mo4318 != null) {
            jM7166 = c5805Mo4318.f19129;
            if (jM7166 <= 0 || C5805.m9615(jM7166)) {
                c5805Mo4317 = c1802.f6002.mo4317();
                if (c5805Mo4317 != null) {
                    jM7166 = c5805Mo4317.f19129;
                    if (jM7166 > 0 || C5805.m9615(jM7166)) {
                        jM7166 = AbstractC4009.m7166(30, EnumC3021.MINUTES);
                    }
                } else {
                    jM7166 = AbstractC4009.m7166(30, EnumC3021.MINUTES);
                }
            }
        } else {
            c5805Mo4317 = c1802.f6002.mo4317();
            if (c5805Mo4317 != null) {
                jM7166 = c5805Mo4317.f19129;
                if (jM7166 > 0) {
                    jM7166 = AbstractC4009.m7166(30, EnumC3021.MINUTES);
                } else {
                    jM7166 = AbstractC4009.m7166(30, EnumC3021.MINUTES);
                }
            } else {
                jM7166 = AbstractC4009.m7166(30, EnumC3021.MINUTES);
            }
        }
        boolean z = C5805.m9614(jM7170, jM7166) > 0;
        if (z) {
            Log.d("FirebaseSessions", "Session " + c1521.f5162 + " is expired");
        }
        return z;
    }
}
