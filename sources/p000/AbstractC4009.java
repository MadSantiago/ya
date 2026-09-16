package p000;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.text.Spanned;
import android.view.View;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import org.luckypray.dexkit.DexKitBridge;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۦّؒٚۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4009 {

    /* JADX INFO: renamed from: ۥؗ */
    public static int f13362 = 3;

    /* JADX INFO: renamed from: ۦِ */
    public static C2885 f13369;

    /* JADX INFO: renamed from: ۥۣ */
    public static final C5536 f13367 = new C5536(2, "RESUME_TOKEN");

    /* JADX INFO: renamed from: ۥۗ */
    public static InterfaceC4329 f13365 = new C4036(5);

    /* JADX INFO: renamed from: ۦؑ */
    public static final StackTraceElement[] f13368 = new StackTraceElement[0];

    /* JADX INFO: renamed from: ۥُ */
    public static final C4508 f13363 = new C4508();

    /* JADX INFO: renamed from: ۥّ */
    public static final String[] f13364 = {"ga_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", "ad_unit_id", "ga_error", "ga_error_value", "ga_error_length", "ga_event_origin", "ga_screen", "ga_screen_class", "ga_screen_id", "ga_previous_screen", "ga_previous_class", "ga_previous_id", "manual_tracking", "message_device_time", "message_id", "message_name", "message_time", "message_tracking_id", "message_type", "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "ga_event_id", "ga_extra_params_ct", "ga_group_name", "ga_list_length", "ga_index", "ga_event_name", "campaign_info_source", "cached_campaign", "deferred_analytics_collection", "ga_session_number", "ga_session_id", "campaign_extra_referrer", "app_in_background", "firebase_feature_rollouts", "customer_type", "firebase_conversion", "firebase_error", "firebase_error_value", "firebase_error_length", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "firebase_previous_screen", "firebase_previous_class", "firebase_previous_id", "session_number", "session_id"};

    /* JADX INFO: renamed from: ۦۙ */
    public static final String[] f13371 = {"_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_mst", "_ndt", "_nmid", "_nmn", "_nmt", "_nmtid", "_nmc", "_pv", "_po", "_nt", "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en", "_cis", "_cc", "_dac", "_sno", "_sid", "_cer", "_aib", "_ffr", "_ct", "_c", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_sno", "_sid"};

    /* JADX INFO: renamed from: ۥۜ */
    public static final String[] f13366 = {"items"};

    /* JADX INFO: renamed from: ۦٛ */
    public static final String[] f13370 = {"affiliation", "coupon", "creative_name", "creative_slot", "currency", "_ct", "discount", "index", "item_id", "item_brand", "item_category", "item_category2", "item_category3", "item_category4", "item_category5", "item_list_name", "item_list_id", "item_name", "item_variant", "location_id", "payment_type", "price", "promotion_id", "promotion_name", "quantity", "shipping", "shipping_tier", "tax", "transaction_id", "value", "item_list", "checkout_step", "checkout_option", "item_location_id"};

    /* JADX INFO: renamed from: ۥؓ */
    public static final boolean m7148(C2793 c2793, C2793 c2794, C2793 c2795, int i) {
        if (!m7167(i, c2793, c2795)) {
            return false;
        }
        if (m7167(i, c2794, c2795) && !m7182(c2795, c2793, c2794, i)) {
            return !m7182(c2795, c2794, c2793, i) && m7152(i, c2795, c2793) < m7152(i, c2795, c2794);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥؔ */
    public static void m7149(Parcel parcel, C1162 c1162) {
        parcel.writeInt(1);
        parcel.writeValue(c1162.f4031);
    }

    /* JADX INFO: renamed from: ۥؖ */
    public static final boolean m7150(InterfaceC4643 interfaceC4643) {
        InterfaceC3196 interfaceC3196 = (InterfaceC3196) interfaceC4643.mo1586().mo865(C1397.f4791);
        if (interfaceC3196 != null) {
            return interfaceC3196.mo866();
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static final C3950 m7151(InterfaceC3534 interfaceC3534) {
        if (interfaceC3534.mo865(C1397.f4791) == null) {
            interfaceC3534 = interfaceC3534.mo860(AbstractC5568.m9366());
        }
        return new C3950(interfaceC3534);
    }

    /* JADX INFO: renamed from: ۥً */
    public static final long m7152(int i, C2793 c2793, C2793 c2794) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (i == 3) {
            f = c2793.f9343;
            f2 = c2794.f9341;
        } else if (i == 4) {
            f = c2794.f9343;
            f2 = c2793.f9341;
        } else if (i == 5) {
            f = c2793.f9342;
            f2 = c2794.f9344;
        } else {
            if (i != 6) {
                C1078.m2276("This function should only be used for 2-D focus search");
                return 0L;
            }
            f = c2794.f9342;
            f2 = c2793.f9344;
        }
        float f6 = f - f2;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        long j = (long) f6;
        if (i == 3 || i == 4) {
            float f7 = c2793.f9342;
            f3 = ((c2793.f9344 - f7) / 2.0f) + f7;
            f4 = c2794.f9342;
            f5 = c2794.f9344;
        } else {
            if (i != 5 && i != 6) {
                C1078.m2276("This function should only be used for 2-D focus search");
                return 0L;
            }
            float f8 = c2793.f9343;
            f3 = ((c2793.f9341 - f8) / 2.0f) + f8;
            f4 = c2794.f9343;
            f5 = c2794.f9341;
        }
        long j2 = (long) (f3 - (((f5 - f4) / 2.0f) + f4));
        return (j2 * j2) + (13 * j * j);
    }

    /* JADX INFO: renamed from: ۥَ */
    public static final boolean m7153(int i, C5583 c5583, C3468 c3468, C2793 c2793) {
        if (m7171(i, c5583, c3468, c2793)) {
            return true;
        }
        Boolean bool = (Boolean) AbstractC0993.m2141(c3468, i, new C4934(((C2016) ((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5537.m9224(c3468)).getFocusOwner()).m3926(), c3468, c2793, i, c5583, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥُ */
    public static final void m7154(InterfaceC0705 interfaceC0705, float f, long j, C5362 c5362, final int i, final int i2) {
        int i3;
        final long jM216;
        final float f2;
        final InterfaceC0705 interfaceC0706;
        final long j2;
        final float f3;
        c5362.m8979(75144485);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (c5362.m8963(interfaceC0705) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= c5362.m8956(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            jM216 = j;
            i3 |= ((i2 & 4) == 0 && c5362.m8961(jM216)) ? 256 : 128;
        } else {
            jM216 = j;
        }
        boolean z = true;
        if (c5362.m9011(i3 & 1, (i3 & 147) != 146)) {
            c5362.m8971();
            if ((i & 1) == 0 || c5362.m8969()) {
                if (i4 != 0) {
                    interfaceC0705 = C4217.f13994;
                }
                f3 = i5 != 0 ? 1.0f : f;
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    jM216 = AbstractC0118.m216(25, c5362);
                }
            } else {
                c5362.m8982();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                f3 = f;
            }
            c5362.m8964();
            InterfaceC0705 interfaceC0705M7703 = AbstractC4410.m7703(interfaceC0705.mo1571(AbstractC4410.f14521), f3);
            boolean z2 = (i3 & 112) == 32;
            if ((((i3 & 896) ^ 384) <= 256 || !c5362.m8961(jM216)) && (i3 & 384) != 256) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object objM8999 = c5362.m8999();
            if (z3 || objM8999 == C2850.f9517) {
                objM8999 = new InterfaceC4745() { // from class: ۦٔؑٚؑ
                    @Override // p000.InterfaceC4745
                    /* JADX INFO: renamed from: ۦؚ */
                    public final Object mo211(Object obj) {
                        InterfaceC2442 interfaceC2442 = (InterfaceC2442) obj;
                        float f4 = f3;
                        float fMo741 = interfaceC2442.mo741(f4);
                        float fMo742 = interfaceC2442.mo741(f4) / 2.0f;
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fMo742)) & 4294967295L);
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC2442.mo4567() >> 32));
                        float fMo743 = interfaceC2442.mo741(f4) / 2.0f;
                        interfaceC2442.mo3900(jM216, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(fMo743)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32), fMo741);
                        return C2358.f7817;
                    }
                };
                c5362.m8987(objM8999);
            }
            m7165(interfaceC0705M7703, (InterfaceC4745) objM8999, c5362, 0);
            f2 = f3;
            j2 = jM216;
            interfaceC0706 = interfaceC0705;
        } else {
            c5362.m8982();
            f2 = f;
            interfaceC0706 = interfaceC0705;
            j2 = jM216;
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new InterfaceC5731() { // from class: ۦۘؖۚۛ
                @Override // p000.InterfaceC5731
                /* JADX INFO: renamed from: ۥۜ */
                public final Object mo219(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC4009.m7154(interfaceC0706, f2, j2, (C5362) obj, AbstractC3831.m6835(i | 1), i2);
                    return C2358.f7817;
                }
            };
        }
    }

    /* JADX INFO: renamed from: ۥّ */
    public static final long m7155(long j, long j2) {
        if (j != 4611686018427387903L && j != -4611686018427387903L) {
            return (j2 == 4611686018427387903L || j2 == -4611686018427387903L) ? j2 : AbstractC4554.m7941(j + j2, -4611686018427387903L, 4611686018427387903L);
        }
        if ((-4611686018427387903L >= j2 || j2 >= 4611686018427387903L) && (j2 ^ j) < 0) {
            return 9223372036854759646L;
        }
        return j;
    }

    /* JADX INFO: renamed from: ۥْ */
    public static final boolean m7156(C3468 c3468, int i, InterfaceC4745 interfaceC4745) {
        C2793 c2793;
        C0863 c0863 = new C0863(new C3468[16]);
        m7181(c3468, c0863);
        int i2 = c0863.f3180;
        if (i2 <= 1) {
            C3468 c3469 = (C3468) (i2 == 0 ? null : c0863.f3182[0]);
            if (c3469 != null) {
                return ((Boolean) interfaceC4745.mo211(c3469)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                C2793 c2793M7032 = AbstractC3925.m7032(c3468);
                float f = c2793M7032.f9343;
                float f2 = c2793M7032.f9342;
                c2793 = new C2793(f, f2, f, f2);
            } else {
                if (i != 3 && i != 5) {
                    C1078.m2276("This function should only be used for 2-D focus search");
                    return false;
                }
                C2793 c2793M7033 = AbstractC3925.m7032(c3468);
                float f3 = c2793M7033.f9341;
                float f4 = c2793M7033.f9344;
                c2793 = new C2793(f3, f4, f3, f4);
            }
            C3468 c3468M7186 = m7186(c0863, c2793, i);
            if (c3468M7186 != null) {
                return ((Boolean) interfaceC4745.mo211(c3468M7186)).booleanValue();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public static C3570 m7157(DexKitBridge dexKitBridge, C0035 c0035) {
        int iM4031 = c0035.m4031(10);
        int i = iM4031 != 0 ? c0035.f6878.getInt(iM4031 + c0035.f6879) : 0;
        if ((i & 131072) > 0) {
            i = (i ^ 131072) | 32;
        }
        int i2 = i;
        int iM4032 = c0035.m4031(4);
        int i3 = iM4032 != 0 ? c0035.f6878.getInt(iM4032 + c0035.f6879) : 0;
        int iM4033 = c0035.m4031(6);
        int i4 = iM4033 != 0 ? c0035.f6878.getInt(iM4033 + c0035.f6879) : 0;
        int iM4034 = c0035.m4031(8);
        int i5 = iM4034 != 0 ? c0035.f6878.getInt(iM4034 + c0035.f6879) : 0;
        int iM4035 = c0035.m4031(12);
        String strM4033 = iM4035 != 0 ? c0035.m4033(iM4035 + c0035.f6879) : null;
        if (strM4033 == null) {
            strM4033 = "";
        }
        String str = strM4033;
        int iM4036 = c0035.m4031(14);
        int i6 = iM4036 != 0 ? c0035.f6878.getInt(iM4036 + c0035.f6879) : 0;
        ArrayList arrayList = new ArrayList();
        int iM4037 = c0035.m4031(16);
        int iM4030 = iM4037 != 0 ? c0035.m4030(iM4037) : 0;
        for (int i7 = 0; i7 < iM4030; i7++) {
            int iM4038 = c0035.m4031(16);
            arrayList.add(Integer.valueOf(iM4038 != 0 ? c0035.f6878.getInt((i7 * 4) + c0035.m4029(iM4038)) : 0));
        }
        return new C3570(dexKitBridge, i3, i4, i5, i2, str, i6, arrayList);
    }

    /* JADX INFO: renamed from: ۥٕ */
    public static C3121 m7158(Class cls) {
        return new C3121(2, new C4229(cls, null, 1));
    }

    /* JADX INFO: renamed from: ۥٖ */
    public static final View m7159(AbstractC5381 abstractC5381) {
        C4855 c4855 = AbstractC5537.m9270(abstractC5381.f17791).f2240;
        View interopView = c4855 != null ? c4855.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        C1078.m2276("Could not fetch interop view");
        return null;
    }

    /* JADX INFO: renamed from: ۥٙ */
    public static int m7160(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        C1078.m2272(AbstractC5078.m8670(i, "type needs to be >= FIRST and <= LAST, type="));
        return 0;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public static /* synthetic */ String m7161(int i) {
        return m7184(i, new Object[0]);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static C3529 m7162() {
        C3529 c3529 = new C3529(true);
        c3529.m872(null);
        return c3529;
    }

    /* JADX INFO: renamed from: ۥۙ */
    public static C3121 m7163(Object obj) {
        int i = 2;
        if (obj instanceof C3131) {
            return new C3121(i, new C4229(((C3131) obj).f10543, obj, 1));
        }
        return obj instanceof Class ? new C3121(i, new C4229((Class) obj, obj, 1)) : new C3121(i, new C4229(obj.getClass(), obj, 1));
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static final boolean m7164(int i, C2793 c2793, C2793 c2794) {
        if (i == 3 || i == 4) {
            return c2793.f9344 > c2794.f9342 && c2793.f9342 < c2794.f9344;
        }
        if (i == 5 || i == 6) {
            return c2793.f9341 > c2794.f9343 && c2793.f9343 < c2794.f9341;
        }
        C1078.m2276("This function should only be used for 2-D focus search");
        return false;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final void m7165(InterfaceC0705 interfaceC0705, InterfaceC4745 interfaceC4745, C5362 c5362, int i) {
        c5362.m8979(-932836462);
        int i2 = 2;
        int i3 = (c5362.m8963(interfaceC0705) ? 4 : 2) | i | (c5362.m8977(interfaceC4745) ? 32 : 16);
        if (c5362.m9011(i3 & 1, (i3 & 19) != 18)) {
            AbstractC1434.m3048(c5362, AbstractC1434.m3037(interfaceC0705, interfaceC4745));
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C4762(i, i2, interfaceC0705, interfaceC4745);
        }
    }

    /* JADX INFO: renamed from: ۥۦ */
    public static final long m7166(int i, EnumC3021 enumC3021) {
        if (enumC3021.compareTo(EnumC3021.SECONDS) > 0) {
            return m7170(i, enumC3021);
        }
        long jConvert = TimeUnit.NANOSECONDS.convert(i, enumC3021.f10178);
        C4036 c4036 = C5805.f19128;
        long j = jConvert << 1;
        int i2 = AbstractC4578.f15108;
        return j;
    }

    /* JADX INFO: renamed from: ۥۧ */
    public static final boolean m7167(int i, C2793 c2793, C2793 c2794) {
        if (i == 3) {
            float f = c2794.f9341;
            float f2 = c2794.f9343;
            float f3 = c2793.f9341;
            return (f > f3 || f2 >= f3) && f2 > c2793.f9343;
        }
        if (i == 4) {
            float f4 = c2794.f9343;
            float f5 = c2794.f9341;
            float f6 = c2793.f9343;
            return (f4 < f6 || f5 <= f6) && f5 < c2793.f9341;
        }
        if (i == 5) {
            float f7 = c2794.f9344;
            float f8 = c2794.f9342;
            float f9 = c2793.f9344;
            return (f7 > f9 || f8 >= f9) && f8 > c2793.f9342;
        }
        if (i != 6) {
            C1078.m2276("This function should only be used for 2-D focus search");
            return false;
        }
        float f10 = c2794.f9342;
        float f11 = c2794.f9344;
        float f12 = c2793.f9342;
        return (f10 < f12 || f11 <= f12) && f11 < c2793.f9344;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static final C0505 m7168(Context context) {
        float f = context.getResources().getConfiguration().fontScale;
        float f2 = context.getResources().getDisplayMetrics().density;
        InterfaceC4770 interfaceC4770M5956 = AbstractC3232.m5956(f);
        if (interfaceC4770M5956 == null) {
            interfaceC4770M5956 = new C2105(f);
        }
        return new C0505(f2, f, interfaceC4770M5956);
    }

    /* JADX INFO: renamed from: ۦؖ */
    public static final InterfaceC0705 m7169(boolean z, boolean z2, InterfaceC4448 interfaceC4448) {
        InterfaceC0705 c4454 = C4217.f13994;
        if (!z || !AbstractC2138.f7016) {
            return c4454;
        }
        if (z2) {
            c4454 = new C4454(f13363);
        }
        return c4454.mo1571(new C3722(interfaceC4448));
    }

    /* JADX INFO: renamed from: ۦؗ */
    public static final long m7170(long j, EnumC3021 enumC3021) {
        TimeUnit timeUnit = enumC3021.f10178;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long jConvert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-jConvert) <= j && j <= jConvert) {
            long jConvert2 = timeUnit2.convert(j, timeUnit);
            C4036 c4036 = C5805.f19128;
            long j2 = jConvert2 << 1;
            int i = AbstractC4578.f15108;
            return j2;
        }
        if (enumC3021.compareTo(EnumC3021.MILLISECONDS) < 0) {
            return m7183(AbstractC4554.m7941(TimeUnit.MILLISECONDS.convert(j, timeUnit), -4611686018427387903L, 4611686018427387903L));
        }
        long jSignum = Long.signum(j);
        if (j < -9223372036854775807L) {
            j = -9223372036854775807L;
        }
        return m7183(AbstractC0186.m416(Math.abs(j), enumC3021) * jSignum);
    }

    /* JADX INFO: renamed from: ۦؙ */
    public static final boolean m7171(int i, C5583 c5583, C3468 c3468, C2793 c2793) {
        C3468 c3468M7186;
        C0863 c0863 = new C0863(new C3468[16]);
        if (!c3468.f17791.f17786) {
            AbstractC3480.m6278("visitChildren called on an unattached node");
        }
        C0863 c0864 = new C0863(new AbstractC5381[16]);
        AbstractC5381 abstractC5381 = c3468.f17791;
        AbstractC5381 abstractC5382 = abstractC5381.f17783;
        if (abstractC5382 == null) {
            AbstractC5537.m9249(c0864, abstractC5381);
        } else {
            c0864.m1843(abstractC5382);
        }
        while (true) {
            int i2 = c0864.f3180;
            if (i2 == 0) {
                break;
            }
            AbstractC5381 abstractC5381M9233 = (AbstractC5381) c0864.m1850(i2 - 1);
            if ((abstractC5381M9233.f17782 & 1024) == 0) {
                AbstractC5537.m9249(c0864, abstractC5381M9233);
            } else {
                while (abstractC5381M9233 != null) {
                    if ((abstractC5381M9233.f17781 & 1024) != 0) {
                        C0863 c0865 = null;
                        while (abstractC5381M9233 != null) {
                            if (abstractC5381M9233 instanceof C3468) {
                                C3468 c3469 = (C3468) abstractC5381M9233;
                                if (c3469.f17786) {
                                    c0863.m1843(c3469);
                                }
                            } else if ((abstractC5381M9233.f17781 & 1024) != 0 && (abstractC5381M9233 instanceof AbstractC3019)) {
                                int i3 = 0;
                                for (AbstractC5381 abstractC5383 = ((AbstractC3019) abstractC5381M9233).f10167; abstractC5383 != null; abstractC5383 = abstractC5383.f17783) {
                                    if ((abstractC5383.f17781 & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            abstractC5381M9233 = abstractC5383;
                                        } else {
                                            if (c0865 == null) {
                                                c0865 = new C0863(new AbstractC5381[16]);
                                            }
                                            if (abstractC5381M9233 != null) {
                                                c0865.m1843(abstractC5381M9233);
                                                abstractC5381M9233 = null;
                                            }
                                            c0865.m1843(abstractC5383);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            abstractC5381M9233 = AbstractC5537.m9233(c0865);
                        }
                        break;
                    }
                    abstractC5381M9233 = abstractC5381M9233.f17783;
                }
            }
        }
        while (c0863.f3180 != 0 && (c3468M7186 = m7186(c0863, c2793, i)) != null) {
            if (c3468M7186.m6250().f4555) {
                return ((Boolean) c5583.mo211(c3468M7186)).booleanValue();
            }
            if (m7153(i, c5583, c3468M7186, c2793)) {
                return true;
            }
            c0863.m1848(c3468M7186);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static final boolean m7172(C2793 c2793, float f, float f2) {
        float f3 = c2793.f9343;
        if (f > c2793.f9341 || f3 > f) {
            return false;
        }
        return f2 <= c2793.f9344 && c2793.f9342 <= f2;
    }

    /* JADX INFO: renamed from: ۦٌ */
    public static final Object m7173(InterfaceC5731 interfaceC5731, InterfaceC0443 interfaceC0443) {
        C5555 c5555 = new C5555(interfaceC0443, interfaceC0443.mo334());
        return AbstractC0487.m1066(c5555, true, c5555, interfaceC5731);
    }

    /* JADX INFO: renamed from: ۦُ */
    public static final Boolean m7174(int i, C5583 c5583, C3468 c3468, C2793 c2793) {
        int iOrdinal = c3468.m6254().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                C3468 c3468M7033 = AbstractC3925.m7033(c3468);
                if (c3468M7033 == null) {
                    C1078.m2276("ActiveParent must have a focusedChild");
                    return null;
                }
                int iOrdinal2 = c3468M7033.m6254().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        Boolean boolM7174 = m7174(i, c5583, c3468M7033, c2793);
                        if (!AbstractC3831.m6874(boolM7174, Boolean.FALSE)) {
                            return boolM7174;
                        }
                        if (c2793 == null) {
                            if (c3468M7033.m6254() != EnumC4125.f13741) {
                                C1078.m2276("Searching for active node in inactive hierarchy");
                                return null;
                            }
                            C3468 c3468M7060 = AbstractC3925.m7060(c3468M7033);
                            if (c3468M7060 == null) {
                                C1078.m2276("ActiveParent must have a focusedChild");
                                return null;
                            }
                            c2793 = AbstractC3925.m7032(c3468M7060);
                        }
                        return Boolean.valueOf(m7153(i, c5583, c3468, c2793));
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            C1078.m2275();
                            return null;
                        }
                        C1078.m2276("ActiveParent must have a focusedChild");
                        return null;
                    }
                }
                if (c2793 == null) {
                    c2793 = AbstractC3925.m7032(c3468M7033);
                }
                return Boolean.valueOf(m7153(i, c5583, c3468, c2793));
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C1078.m2275();
                    return null;
                }
                if (c3468.m6250().f4555) {
                    return (Boolean) c5583.mo211(c3468);
                }
                return c2793 == null ? Boolean.valueOf(m7156(c3468, i, c5583)) : Boolean.valueOf(m7171(i, c5583, c3468, c2793));
            }
        }
        return Boolean.valueOf(m7156(c3468, i, c5583));
    }

    /* JADX INFO: renamed from: ۦِ */
    public static final String m7175(C0971 c0971, InterfaceC0103 interfaceC0103) {
        for (Annotation annotation : interfaceC0103.getAnnotations()) {
            if (annotation instanceof InterfaceC0476) {
                return ((InterfaceC0476) annotation).discriminator();
            }
        }
        return (String) c0971.f3430.f11624;
    }

    /* JADX INFO: renamed from: ۦٕ */
    public static final boolean m7176(C1249 c1249) {
        int length = c1249.f4307.length();
        List list = c1249.f4308;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C2331 c2331 = (C2331) list.get(i);
                if ((c2331.f7719 instanceof AbstractC4428) && AbstractC5556.m9310(0, length, c2331.f7718, c2331.f7717)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦٖ */
    public static void m7177(C2139 c2139) {
        if (c2139.getTag(R.id.markwon_drawables_scheduler_last_text_hashcode) == null) {
            return;
        }
        c2139.setTag(R.id.markwon_drawables_scheduler_last_text_hashcode, null);
        C4478[] c4478ArrM7187 = m7187(c2139);
        if (c4478ArrM7187 == null || c4478ArrM7187.length <= 0) {
            return;
        }
        for (C4478 c4478 : c4478ArrM7187) {
            c4478.f14785.m1747(null);
        }
    }

    /* JADX INFO: renamed from: ۦٗ */
    public static final Object m7178(C2542 c2542, C3059 c3059) {
        Object objM6027 = c2542.f8490.m6027(c3059);
        if (objM6027 == null) {
            return null;
        }
        return objM6027;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x017e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0199 A[LOOP:7: B:106:0x0197->B:107:0x0199, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:117:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:137:0x0223  */
    /* JADX WARN: Code duplicated, block: B:139:0x0227  */
    /* JADX WARN: Code duplicated, block: B:141:0x022b  */
    /* JADX WARN: Code duplicated, block: B:143:0x022f  */
    /* JADX WARN: Code duplicated, block: B:144:0x0231  */
    /* JADX WARN: Code duplicated, block: B:145:0x0234  */
    /* JADX WARN: Code duplicated, block: B:146:0x0237  */
    /* JADX WARN: Code duplicated, block: B:148:0x023a  */
    /* JADX WARN: Code duplicated, block: B:149:0x023c  */
    /* JADX WARN: Code duplicated, block: B:155:0x024b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:156:0x024d  */
    /* JADX WARN: Code duplicated, block: B:159:0x0259 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:160:0x025b  */
    /* JADX WARN: Code duplicated, block: B:162:0x026e  */
    /* JADX WARN: Code duplicated, block: B:194:0x029c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x029c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x0215 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x0284 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x0255 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x0280 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x027c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:0x0155 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0190 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x0192 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0091  */
    /* JADX WARN: Code duplicated, block: B:77:0x0112  */
    /* JADX WARN: Code duplicated, block: B:81:0x011c  */
    /* JADX WARN: Code duplicated, block: B:87:0x012d  */
    /* JADX WARN: Code duplicated, block: B:89:0x013d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0145  */
    /* JADX WARN: Code duplicated, block: B:96:0x015c A[LOOP:5: B:95:0x015a->B:96:0x015c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x0172  */
    /* JADX INFO: renamed from: ۦٚ */
    public static long m7179(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        int i5;
        int i6;
        int i7;
        long j2;
        char cCharAt;
        EnumC3021 enumC3021;
        char cCharAt2;
        EnumC3021 enumC3022;
        long jM7155;
        int i8;
        int iMin;
        int i9;
        int i10;
        int i11;
        int iMin2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        double d;
        long jM5222;
        char cCharAt3;
        int i17;
        char cCharAt4;
        char cCharAt5;
        char cCharAt6;
        int i18;
        int i19;
        char cCharAt7;
        if (str.length() == 0) {
            C1078.m2272("The string is empty");
            return 0L;
        }
        char cCharAt8 = str.charAt(0);
        int i20 = 1;
        char c = '-';
        char c2 = '+';
        if (cCharAt8 != '+') {
            i2 = cCharAt8 != '-' ? 0 : 1;
            i = i2;
        } else {
            i = 0;
            i2 = 1;
        }
        if (str.length() <= i2) {
            C1078.m2272("No components");
            return 0L;
        }
        if (str.charAt(i2) != 'P') {
            C1078.m2272("");
            return 0L;
        }
        int i21 = i2 + 1;
        if (i21 == str.length()) {
            C1078.m2272("");
            return 0L;
        }
        int i22 = 0;
        EnumC3021 enumC3023 = null;
        long jM416 = 0;
        long j3 = 0;
        while (i21 < str.length()) {
            char cCharAt9 = str.charAt(i21);
            if (cCharAt9 != 'T') {
                C3777 c3777 = C3777.f12550;
                int i23 = i20;
                char cCharAt10 = str.charAt(i21);
                if (cCharAt10 != c2) {
                    if (cCharAt10 != c) {
                        i3 = i21;
                    } else {
                        i3 = i21 + 1;
                        i4 = -1;
                    }
                    while (i3 < str.length() && str.charAt(i3) == '0') {
                        i3++;
                    }
                    j = 0;
                    while (true) {
                        if (i3 < str.length()) {
                            cCharAt6 = str.charAt(i3);
                            i5 = i21;
                            if ('0' > cCharAt6 && cCharAt6 < ':') {
                                i18 = cCharAt6 - '0';
                                i19 = i;
                                long j4 = c3777.f12552;
                                if (j > j4 || (j == j4 && i18 > c3777.f12551)) {
                                    i6 = i19;
                                    while (i3 < str.length() && '0' <= (cCharAt7 = str.charAt(i3)) && cCharAt7 < ':') {
                                        i3++;
                                    }
                                    if (i3 != str.length()) {
                                        if (i3 != i5 + ((cCharAt9 == '+' || cCharAt9 == '-') ? i23 : 0)) {
                                            j = 4611686018427387903L;
                                        }
                                    }
                                    C1078.m2272("");
                                    return 0L;
                                }
                                j = (j << 3) + (j << i23) + ((long) i18);
                                i3++;
                                i21 = i5;
                                c3777 = c3777;
                                i = i19;
                            }
                            j2 = j;
                            cCharAt = str.charAt(i3);
                            enumC3021 = EnumC3021.SECONDS;
                            if (cCharAt == '.') {
                                i8 = i3 + 1;
                                iMin = Math.min(i3 + 7, str.length());
                                i10 = 0;
                                for (i9 = i8; i9 < iMin; i9++) {
                                    cCharAt5 = str.charAt(i9);
                                    if ('0' <= cCharAt5 || cCharAt5 >= ':') {
                                        for (i11 = 0; i11 < 6 - (i9 - i8); i11++) {
                                            i10 = (i10 << 1) + (i10 << 3);
                                        }
                                        iMin2 = Math.min(i9 + 9, str.length());
                                        i12 = i9;
                                        i13 = 0;
                                        while (true) {
                                            if (i12 < iMin2) {
                                                i17 = iMin2;
                                                cCharAt4 = str.charAt(i12);
                                                i14 = i12;
                                                if ('0' > cCharAt4 && cCharAt4 < ':') {
                                                    i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                                    i12 = i14 + 1;
                                                    iMin2 = i17;
                                                }
                                            } else {
                                                i14 = i12;
                                            }
                                        }
                                        for (i15 = 0; i15 < 9 - (i14 - i9); i15++) {
                                            i13 = (i13 << 1) + (i13 << 3);
                                        }
                                        i16 = i14;
                                        while (i16 < str.length() && '0' <= (cCharAt3 = str.charAt(i16)) && cCharAt3 < ':') {
                                            i16++;
                                        }
                                        if (i16 != i8 || i16 == str.length() || str.charAt(i16) != 'S') {
                                            C1078.m2272("");
                                            return 0L;
                                        }
                                        int i24 = i16;
                                        long j5 = (((long) i10) * 1000000000) + ((long) i13);
                                        long j6 = i4;
                                        double d2 = j5;
                                        switch (enumC3021.ordinal()) {
                                            case 0:
                                                d = 1.0E-15d;
                                                jM5222 = AbstractC2776.m5222(d2 * d);
                                                break;
                                            case 1:
                                                d = 1.0E-12d;
                                                jM5222 = AbstractC2776.m5222(d2 * d);
                                                break;
                                            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                                d = 1.0E-9d;
                                                jM5222 = AbstractC2776.m5222(d2 * d);
                                                break;
                                            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                                d = 1.0E-6d;
                                                jM5222 = AbstractC2776.m5222(d2 * d);
                                                break;
                                            case C4261.LONG_FIELD_NUMBER /* 4 */:
                                                d = 6.0E-5d;
                                                jM5222 = AbstractC2776.m5222(d2 * d);
                                                break;
                                            case C4261.STRING_FIELD_NUMBER /* 5 */:
                                                d = 0.0036d;
                                                jM5222 = AbstractC2776.m5222(d2 * d);
                                                break;
                                            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                                                d = 0.0864d;
                                                jM5222 = AbstractC2776.m5222(d2 * d);
                                                break;
                                            default:
                                                C5028.m8449(enumC3021, "Unknown unit: ");
                                                jM5222 = 0;
                                                break;
                                        }
                                        j3 = jM5222 * j6;
                                        i3 = i24;
                                    } else {
                                        i10 = (cCharAt5 - '0') + (i10 << 3) + (i10 << 1);
                                    }
                                }
                                while (i11 < 6 - (i9 - i8)) {
                                    i10 = (i10 << 1) + (i10 << 3);
                                }
                                iMin2 = Math.min(i9 + 9, str.length());
                                i12 = i9;
                                i13 = 0;
                                while (true) {
                                    if (i12 < iMin2) {
                                        i17 = iMin2;
                                        cCharAt4 = str.charAt(i12);
                                        i14 = i12;
                                        if ('0' > cCharAt4) {
                                        }
                                    } else {
                                        i14 = i12;
                                    }
                                    i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                    i12 = i14 + 1;
                                    iMin2 = i17;
                                }
                                while (i15 < 9 - (i14 - i9)) {
                                    i13 = (i13 << 1) + (i13 << 3);
                                }
                                i16 = i14;
                                while (i16 < str.length()) {
                                    i16++;
                                }
                                if (i16 != i8) {
                                }
                                C1078.m2272("");
                                return 0L;
                            }
                            cCharAt2 = str.charAt(i3);
                            enumC3022 = EnumC3021.DAYS;
                            if (cCharAt2 == 'D') {
                                enumC3021 = enumC3022;
                            } else if (cCharAt2 == 'H') {
                                enumC3021 = EnumC3021.HOURS;
                            } else if (cCharAt2 == 'M') {
                                enumC3021 = EnumC3021.MINUTES;
                            } else if (cCharAt2 != 'S') {
                                enumC3021 = null;
                            }
                            if (enumC3021 == null) {
                                throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                            }
                            if (enumC3023 == null && enumC3023.compareTo(enumC3021) <= 0) {
                                C1078.m2272("Unexpected order of duration components");
                                return 0L;
                            }
                            if (enumC3021 == enumC3022) {
                                if (i22 != 0) {
                                    C1078.m2272("");
                                    return 0L;
                                }
                                jM416 = AbstractC0186.m416(j2, enumC3021) * ((long) i4);
                            } else {
                                if (i22 == 0) {
                                    C1078.m2272("");
                                    return 0L;
                                }
                                jM7155 = m7155(jM416, AbstractC0186.m416(j2, enumC3021) * ((long) i4));
                                if (jM7155 == 9223372036854759646L) {
                                    C1078.m2272("");
                                    return 0L;
                                }
                                jM416 = jM7155;
                            }
                            i21 = i3 + 1;
                            enumC3023 = enumC3021;
                            i20 = i23;
                            i = i6;
                            c = '-';
                            c2 = '+';
                        } else {
                            i5 = i21;
                        }
                        i6 = i;
                        if (i3 == str.length()) {
                            if (cCharAt9 != '+' || cCharAt9 == '-') {
                                i7 = i23;
                            } else {
                                i7 = 0;
                            }
                            if (i3 == i5 + i7) {
                            }
                            j2 = j;
                            cCharAt = str.charAt(i3);
                            enumC3021 = EnumC3021.SECONDS;
                            if (cCharAt == '.') {
                                i8 = i3 + 1;
                                iMin = Math.min(i3 + 7, str.length());
                                i10 = 0;
                                while (i9 < iMin) {
                                    cCharAt5 = str.charAt(i9);
                                    if ('0' <= cCharAt5) {
                                    }
                                    while (i11 < 6 - (i9 - i8)) {
                                        i10 = (i10 << 1) + (i10 << 3);
                                    }
                                    iMin2 = Math.min(i9 + 9, str.length());
                                    i12 = i9;
                                    i13 = 0;
                                    while (true) {
                                        if (i12 < iMin2) {
                                            i17 = iMin2;
                                            cCharAt4 = str.charAt(i12);
                                            i14 = i12;
                                            if ('0' > cCharAt4) {
                                            }
                                        } else {
                                            i14 = i12;
                                        }
                                        i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                        i12 = i14 + 1;
                                        iMin2 = i17;
                                    }
                                    while (i15 < 9 - (i14 - i9)) {
                                        i13 = (i13 << 1) + (i13 << 3);
                                    }
                                    i16 = i14;
                                    while (i16 < str.length()) {
                                        i16++;
                                    }
                                    if (i16 != i8) {
                                    }
                                    C1078.m2272("");
                                    return 0L;
                                }
                                while (i11 < 6 - (i9 - i8)) {
                                    i10 = (i10 << 1) + (i10 << 3);
                                }
                                iMin2 = Math.min(i9 + 9, str.length());
                                i12 = i9;
                                i13 = 0;
                                while (true) {
                                    if (i12 < iMin2) {
                                        i17 = iMin2;
                                        cCharAt4 = str.charAt(i12);
                                        i14 = i12;
                                        if ('0' > cCharAt4) {
                                        }
                                    } else {
                                        i14 = i12;
                                    }
                                    i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                    i12 = i14 + 1;
                                    iMin2 = i17;
                                }
                                while (i15 < 9 - (i14 - i9)) {
                                    i13 = (i13 << 1) + (i13 << 3);
                                }
                                i16 = i14;
                                while (i16 < str.length()) {
                                    i16++;
                                }
                                if (i16 != i8) {
                                }
                                C1078.m2272("");
                                return 0L;
                            }
                            cCharAt2 = str.charAt(i3);
                            enumC3022 = EnumC3021.DAYS;
                            if (cCharAt2 == 'D') {
                                enumC3021 = enumC3022;
                            } else if (cCharAt2 == 'H') {
                                enumC3021 = EnumC3021.HOURS;
                            } else if (cCharAt2 == 'M') {
                                enumC3021 = EnumC3021.MINUTES;
                            } else if (cCharAt2 != 'S') {
                                enumC3021 = null;
                            }
                            if (enumC3021 == null) {
                                throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                            }
                            if (enumC3023 == null) {
                            }
                            if (enumC3021 == enumC3022) {
                                if (i22 != 0) {
                                    C1078.m2272("");
                                    return 0L;
                                }
                                jM416 = AbstractC0186.m416(j2, enumC3021) * ((long) i4);
                            } else {
                                if (i22 == 0) {
                                    C1078.m2272("");
                                    return 0L;
                                }
                                jM7155 = m7155(jM416, AbstractC0186.m416(j2, enumC3021) * ((long) i4));
                                if (jM7155 == 9223372036854759646L) {
                                    C1078.m2272("");
                                    return 0L;
                                }
                                jM416 = jM7155;
                            }
                            i21 = i3 + 1;
                            enumC3023 = enumC3021;
                            i20 = i23;
                            i = i6;
                            c = '-';
                            c2 = '+';
                        }
                        C1078.m2272("");
                        return 0L;
                    }
                }
                i3 = i21 + 1;
                i4 = i23;
                while (i3 < str.length()) {
                    i3++;
                }
                j = 0;
                while (true) {
                    if (i3 < str.length()) {
                        cCharAt6 = str.charAt(i3);
                        i5 = i21;
                        if ('0' > cCharAt6) {
                        }
                    } else {
                        i5 = i21;
                    }
                    i6 = i;
                    if (i3 == str.length()) {
                        if (cCharAt9 != '+') {
                            i7 = i23;
                        } else {
                            i7 = i23;
                        }
                        if (i3 == i5 + i7) {
                        }
                        j2 = j;
                        cCharAt = str.charAt(i3);
                        enumC3021 = EnumC3021.SECONDS;
                        if (cCharAt == '.') {
                            i8 = i3 + 1;
                            iMin = Math.min(i3 + 7, str.length());
                            i10 = 0;
                            while (i9 < iMin) {
                                cCharAt5 = str.charAt(i9);
                                if ('0' <= cCharAt5) {
                                }
                                while (i11 < 6 - (i9 - i8)) {
                                    i10 = (i10 << 1) + (i10 << 3);
                                }
                                iMin2 = Math.min(i9 + 9, str.length());
                                i12 = i9;
                                i13 = 0;
                                while (true) {
                                    if (i12 < iMin2) {
                                        i17 = iMin2;
                                        cCharAt4 = str.charAt(i12);
                                        i14 = i12;
                                        if ('0' > cCharAt4) {
                                        }
                                    } else {
                                        i14 = i12;
                                    }
                                    i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                    i12 = i14 + 1;
                                    iMin2 = i17;
                                }
                                while (i15 < 9 - (i14 - i9)) {
                                    i13 = (i13 << 1) + (i13 << 3);
                                }
                                i16 = i14;
                                while (i16 < str.length()) {
                                    i16++;
                                }
                                if (i16 != i8) {
                                }
                                C1078.m2272("");
                                return 0L;
                            }
                            while (i11 < 6 - (i9 - i8)) {
                                i10 = (i10 << 1) + (i10 << 3);
                            }
                            iMin2 = Math.min(i9 + 9, str.length());
                            i12 = i9;
                            i13 = 0;
                            while (true) {
                                if (i12 < iMin2) {
                                    i17 = iMin2;
                                    cCharAt4 = str.charAt(i12);
                                    i14 = i12;
                                    if ('0' > cCharAt4) {
                                    }
                                } else {
                                    i14 = i12;
                                }
                                i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                i12 = i14 + 1;
                                iMin2 = i17;
                            }
                            while (i15 < 9 - (i14 - i9)) {
                                i13 = (i13 << 1) + (i13 << 3);
                            }
                            i16 = i14;
                            while (i16 < str.length()) {
                                i16++;
                            }
                            if (i16 != i8) {
                            }
                            C1078.m2272("");
                            return 0L;
                        }
                        cCharAt2 = str.charAt(i3);
                        enumC3022 = EnumC3021.DAYS;
                        if (cCharAt2 == 'D') {
                            enumC3021 = enumC3022;
                        } else if (cCharAt2 == 'H') {
                            enumC3021 = EnumC3021.HOURS;
                        } else if (cCharAt2 == 'M') {
                            enumC3021 = EnumC3021.MINUTES;
                        } else if (cCharAt2 != 'S') {
                            enumC3021 = null;
                        }
                        if (enumC3021 == null) {
                            throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                        }
                        if (enumC3023 == null) {
                        }
                        if (enumC3021 == enumC3022) {
                            if (i22 != 0) {
                                C1078.m2272("");
                                return 0L;
                            }
                            jM416 = AbstractC0186.m416(j2, enumC3021) * ((long) i4);
                        } else {
                            if (i22 == 0) {
                                C1078.m2272("");
                                return 0L;
                            }
                            jM7155 = m7155(jM416, AbstractC0186.m416(j2, enumC3021) * ((long) i4));
                            if (jM7155 == 9223372036854759646L) {
                                C1078.m2272("");
                                return 0L;
                            }
                            jM416 = jM7155;
                        }
                        i21 = i3 + 1;
                        enumC3023 = enumC3021;
                        i20 = i23;
                        i = i6;
                        c = '-';
                        c2 = '+';
                    }
                    C1078.m2272("");
                    return 0L;
                    j = (j << 3) + (j << i23) + ((long) i18);
                    i3++;
                    i21 = i5;
                    c3777 = c3777;
                    i = i19;
                }
            } else {
                if (i22 != 0 || (i21 = i21 + 1) == str.length()) {
                    C1078.m2272("");
                    return 0L;
                }
                i22 = i20;
            }
        }
        int i25 = i;
        long jM9616 = C5805.m9616(m7170(jM416, EnumC3021.MILLISECONDS), m7170(j3, EnumC3021.NANOSECONDS));
        return (i25 == 0 || jM9616 == C5805.f19125) ? jM9616 : C5805.m9618(jM9616);
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static final void m7180(InterfaceC4643 interfaceC4643, CancellationException cancellationException) {
        InterfaceC3196 interfaceC3196 = (InterfaceC3196) interfaceC4643.mo1586().mo865(C1397.f4791);
        if (interfaceC3196 != null) {
            interfaceC3196.mo871(cancellationException);
        } else {
            C5028.m8449(interfaceC4643, "Scope cannot be cancelled because it does not have a job: ");
        }
    }

    /* JADX INFO: renamed from: ۦۗ */
    public static final void m7181(C3468 c3468, C0863 c0863) {
        if (!c3468.f17791.f17786) {
            AbstractC3480.m6278("visitChildren called on an unattached node");
        }
        C0863 c0864 = new C0863(new AbstractC5381[16]);
        AbstractC5381 abstractC5381 = c3468.f17791;
        AbstractC5381 abstractC5382 = abstractC5381.f17783;
        if (abstractC5382 == null) {
            AbstractC5537.m9249(c0864, abstractC5381);
        } else {
            c0864.m1843(abstractC5382);
        }
        while (true) {
            int i = c0864.f3180;
            if (i == 0) {
                return;
            }
            AbstractC5381 abstractC5381M9233 = (AbstractC5381) c0864.m1850(i - 1);
            if ((abstractC5381M9233.f17782 & 1024) == 0) {
                AbstractC5537.m9249(c0864, abstractC5381M9233);
            } else {
                while (abstractC5381M9233 != null) {
                    if ((abstractC5381M9233.f17781 & 1024) != 0) {
                        C0863 c0865 = null;
                        while (abstractC5381M9233 != null) {
                            if (abstractC5381M9233 instanceof C3468) {
                                C3468 c3469 = (C3468) abstractC5381M9233;
                                if (c3469.f17786 && !AbstractC5537.m9270(c3469).f2242) {
                                    if (c3469.m6250().f4555) {
                                        c0863.m1843(c3469);
                                    } else {
                                        m7181(c3469, c0863);
                                    }
                                }
                            } else if ((abstractC5381M9233.f17781 & 1024) != 0 && (abstractC5381M9233 instanceof AbstractC3019)) {
                                int i2 = 0;
                                for (AbstractC5381 abstractC5383 = ((AbstractC3019) abstractC5381M9233).f10167; abstractC5383 != null; abstractC5383 = abstractC5383.f17783) {
                                    if ((abstractC5383.f17781 & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            abstractC5381M9233 = abstractC5383;
                                        } else {
                                            if (c0865 == null) {
                                                c0865 = new C0863(new AbstractC5381[16]);
                                            }
                                            if (abstractC5381M9233 != null) {
                                                c0865.m1843(abstractC5381M9233);
                                                abstractC5381M9233 = null;
                                            }
                                            c0865.m1843(abstractC5383);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            abstractC5381M9233 = AbstractC5537.m9233(c0865);
                        }
                        break;
                    }
                    abstractC5381M9233 = abstractC5381M9233.f17783;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r11 >= r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r10 <= r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (r9 >= r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r8 <= r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (r21 != 3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (r21 != 4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
    
        if (r21 != 3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        r1 = r11 - r19.f9341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        if (r21 != 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
    
        r1 = r19.f9343 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        if (r21 != 5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        r1 = r9 - r19.f9344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        if (r21 != 6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
    
        r1 = r19.f9342 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        if (r1 >= 0.0f) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006f, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0071, code lost:
    
        if (r21 != 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0073, code lost:
    
        r11 = r11 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
    
        if (r21 != 4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:
    
        r11 = r2 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007a, code lost:
    
        if (r21 != 5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007c, code lost:
    
        r11 = r9 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007f, code lost:
    
        if (r21 != 6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0081, code lost:
    
        r11 = r6 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0087, code lost:
    
        if (r11 >= 1.0f) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0089, code lost:
    
        r11 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008c, code lost:
    
        if (r1 >= r11) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0090, code lost:
    
        p000.C1078.m2276("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0093, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0094, code lost:
    
        p000.C1078.m2276("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0097, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0098, code lost:
    
        return true;
     */
    /* JADX INFO: renamed from: ۦۙ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean m7182(p000.C2793 r18, p000.C2793 r19, p000.C2793 r20, int r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            boolean r4 = m7164(r3, r2, r0)
            float r5 = r2.f9342
            float r6 = r2.f9344
            float r7 = r2.f9343
            float r2 = r2.f9341
            float r8 = r0.f9344
            float r9 = r0.f9342
            float r10 = r0.f9341
            float r11 = r0.f9343
            r12 = 0
            if (r4 != 0) goto L9c
            boolean r0 = m7164(r3, r1, r0)
            if (r0 != 0) goto L27
            goto L9c
        L27:
            java.lang.String r4 = "This function should only be used for 2-D focus search"
            r13 = 6
            r14 = 5
            r15 = 4
            r18 = 1
            r0 = 3
            if (r3 != r0) goto L36
            int r16 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r16 < 0) goto L98
            goto L4a
        L36:
            if (r3 != r15) goto L3d
            int r16 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r16 > 0) goto L98
            goto L4a
        L3d:
            if (r3 != r14) goto L44
            int r16 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r16 < 0) goto L98
            goto L4a
        L44:
            if (r3 != r13) goto L99
            int r16 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r16 > 0) goto L98
        L4a:
            if (r3 != r0) goto L4d
            goto L4f
        L4d:
            if (r3 != r15) goto L50
        L4f:
            return r18
        L50:
            if (r3 != r0) goto L57
            float r1 = r1.f9341
            float r1 = r11 - r1
            goto L69
        L57:
            if (r3 != r15) goto L5d
            float r1 = r1.f9343
            float r1 = r1 - r10
            goto L69
        L5d:
            if (r3 != r14) goto L64
            float r1 = r1.f9344
            float r1 = r9 - r1
            goto L69
        L64:
            if (r3 != r13) goto L94
            float r1 = r1.f9342
            float r1 = r1 - r8
        L69:
            r16 = 0
            int r17 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r17 >= 0) goto L71
            r1 = r16
        L71:
            if (r3 != r0) goto L75
            float r11 = r11 - r7
            goto L83
        L75:
            if (r3 != r15) goto L7a
            float r11 = r2 - r10
            goto L83
        L7a:
            if (r3 != r14) goto L7f
            float r11 = r9 - r5
            goto L83
        L7f:
            if (r3 != r13) goto L90
            float r11 = r6 - r8
        L83:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 >= 0) goto L8a
            r11 = r0
        L8a:
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 >= 0) goto L8f
            return r18
        L8f:
            return r12
        L90:
            p000.C1078.m2276(r4)
            return r12
        L94:
            p000.C1078.m2276(r4)
            return r12
        L98:
            return r18
        L99:
            p000.C1078.m2276(r4)
        L9c:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC4009.m7182(ۥۦٍؓ, ۥۦٍؓ, ۥۦٍؓ, int):boolean");
    }

    /* JADX INFO: renamed from: ۦۚ */
    public static final long m7183(long j) {
        long j2 = (j << 1) + 1;
        C5805.f19128.getClass();
        int i = AbstractC4578.f15108;
        return j2;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public static final String m7184(int i, Object... objArr) {
        C2885 c2885 = f13369;
        if (c2885 == null) {
            new C4441(new long[]{4394185044827492937L, 3656476541777194228L, 1150588305382811368L}).toString();
            c2885 = null;
        }
        return objArr.length == 0 ? c2885.getString(i) : c2885.getString(i, Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX INFO: renamed from: ۦۜ */
    public static String m7185(Context context) {
        try {
            return context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public static final C3468 m7186(C0863 c0863, C2793 c2793, int i) {
        C2793 c2793M5320;
        C3468 c3468 = null;
        if (i == 3) {
            c2793M5320 = c2793.m5320((c2793.f9341 - c2793.f9343) + 1.0f, 0.0f);
        } else if (i == 4) {
            c2793M5320 = c2793.m5320(-((c2793.f9341 - c2793.f9343) + 1.0f), 0.0f);
        } else if (i == 5) {
            c2793M5320 = c2793.m5320(0.0f, (c2793.f9344 - c2793.f9342) + 1.0f);
        } else {
            if (i != 6) {
                C1078.m2276("This function should only be used for 2-D focus search");
                return null;
            }
            c2793M5320 = c2793.m5320(0.0f, -((c2793.f9344 - c2793.f9342) + 1.0f));
        }
        Object[] objArr = c0863.f3182;
        int i2 = c0863.f3180;
        for (int i3 = 0; i3 < i2; i3++) {
            C3468 c3469 = (C3468) objArr[i3];
            if (AbstractC3925.m7027(c3469)) {
                C2793 c2793M7032 = AbstractC3925.m7032(c3469);
                if (m7148(c2793M7032, c2793M5320, c2793, i)) {
                    c3468 = c3469;
                    c2793M5320 = c2793M7032;
                }
            }
        }
        return c3468;
    }

    /* JADX INFO: renamed from: ۦۨ */
    public static C4478[] m7187(C2139 c2139) {
        CharSequence text = c2139.getText();
        int length = text != null ? text.length() : 0;
        if (length == 0 || !(text instanceof Spanned)) {
            return null;
        }
        return (C4478[]) ((Spanned) text).getSpans(0, length, C4478.class);
    }
}
