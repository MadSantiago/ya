package p000;

import android.content.ClipData;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Base64;
import android.util.Log;
import android.view.ContentInfo;
import android.widget.EditText;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: ۦۙؑۙؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C5086 implements InterfaceC3370, InterfaceC2262, InterfaceC3151, InterfaceC1981, InterfaceC1456, InterfaceC2142, InterfaceC4396, InterfaceC3814, InterfaceC0891, InterfaceC4988 {

    /* JADX INFO: renamed from: ۥْ */
    public static volatile C5086 f16875;

    /* JADX INFO: renamed from: ۦ۟ */
    public Object f16877;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f16878;

    /* JADX INFO: renamed from: ۥٓ */
    public static final C4369 f16876 = new C4369(8);

    /* JADX INFO: renamed from: ۥَ */
    public static final C4333 f16874 = new C4333();

    public C5086(int i) {
        this.f16878 = i;
        switch (i) {
            case 1:
                int i2 = AbstractC5529.f18251;
                this.f16877 = new C1039(27, new InterfaceC0130[]{C1298.f4457, f16876});
                break;
            case 17:
                this.f16877 = AbstractC1605.m3349(C2469.f8243);
                break;
            case 19:
                this.f16877 = new C5646(AbstractC3801.f12619);
                break;
            case 24:
                this.f16877 = new ArrayList(20);
                break;
            case 28:
                this.f16877 = new C0863(new C1973[16]);
                break;
            default:
                this.f16877 = new CopyOnWriteArrayList();
                break;
        }
    }

    /* JADX INFO: renamed from: ۥٕ */
    public static String m8685(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: ۦؗ */
    public static void m8686(String str, C2380 c2380) {
        StringBuilder sb = new StringBuilder();
        sb.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date(c2380.f7890 / 1000000)));
        sb.append(": logging error [");
        AbstractC0897 abstractC0897 = c2380.f7893;
        if (abstractC0897 == null) {
            C1078.m2276("cannot request log site information prior to postProcess()");
            return;
        }
        AbstractC5537.m9254(1, abstractC0897, sb);
        sb.append("]: ");
        sb.append(str);
        System.err.println(sb);
        System.err.flush();
    }

    @Override // p000.InterfaceC2142
    public C5336 build() {
        return new C5336(new C4228(((ContentInfo.Builder) this.f16877).build()));
    }

    @Override // p000.InterfaceC2142
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f16877).setExtras(bundle);
    }

    public String toString() {
        switch (this.f16878) {
            case 19:
                return ((C5646) this.f16877).toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: ۥؓ */
    public JSONObject m8687() throws Throwable {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.f16877;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(AbstractC2133.m4151(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream2 = fileInputStream;
                        AbstractC2133.m4138(fileInputStream2, "Error while closing settings cache file.");
                        throw th;
                    }
                } catch (Exception e) {
                    e = e;
                    Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                    AbstractC2133.m4138(fileInputStream, "Error while closing settings cache file.");
                    return null;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            AbstractC2133.m4138(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            AbstractC2133.m4138(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥؖ */
    public void m8688(float f, float f2, float f3, float f4) {
        C2808 c2808 = (C2808) this.f16877;
        InterfaceC3212 interfaceC3212M5353 = c2808.m5353();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c2808.m5355() >> 32)) - (f3 + f);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c2808.m5355() & 4294967295L)) - (f4 + f2))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) < 0.0f) {
            AbstractC5545.m9276("Width and height must be greater than or equal to zero");
        }
        c2808.m5351(jFloatToRawIntBits);
        interfaceC3212M5353.mo2085(f, f2);
    }

    @Override // p000.InterfaceC4396
    /* JADX INFO: renamed from: ۥؗ */
    public long mo7596(C4730 c4730, long j, EnumC2459 enumC2459, long j2) {
        long j3 = ((C0873) ((InterfaceC4448) this.f16877).mo449()).f3199;
        int iM7933 = AbstractC4554.m7933(c4730.f15612 + ((int) (j3 >> 32)), (int) (j2 >> 32), (int) (j >> 32), enumC2459 == EnumC2459.f8215);
        return (((long) AbstractC4554.m7933(c4730.f15611 + ((int) (j3 & 4294967295L)), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true)) & 4294967295L) | (((long) iM7933) << 32);
    }

    /* JADX INFO: renamed from: ۥً */
    public void m8689(String str) {
        ArrayList arrayList = (ArrayList) this.f16877;
        int i = 0;
        while (i < arrayList.size()) {
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    /* JADX INFO: renamed from: ۥَ */
    public void m8690(String str, String str2) {
        ArrayList arrayList = (ArrayList) this.f16877;
        arrayList.add(str);
        arrayList.add(AbstractC0684.m9760(str2).toString());
    }

    @Override // p000.InterfaceC1456
    /* JADX INFO: renamed from: ۥُ */
    public void mo3079(C2202 c2202) {
        this.f16877 = c2202;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Registered Firebase Analytics event receiver for breadcrumbs", null);
        }
    }

    @Override // p000.InterfaceC3151
    /* JADX INFO: renamed from: ۥّ */
    public void mo4838(C2612 c2612) {
        boolean z = c2612.f8713 == 0;
        AbstractC4150 abstractC4150 = (AbstractC4150) this.f16877;
        if (z) {
            abstractC4150.m7339(null, abstractC4150.mo7255());
            return;
        }
        InterfaceC2023 interfaceC2023 = abstractC4150.f13828;
        if (interfaceC2023 != null) {
            interfaceC2023.mo1660(c2612);
        }
    }

    @Override // p000.InterfaceC3370
    /* JADX INFO: renamed from: ۥْ */
    public boolean mo2761(MenuC4903 menuC4903) {
        C4718 c4718 = (C4718) this.f16877;
        if (menuC4903 == c4718.f15555) {
            return false;
        }
        C1092 c1092 = ((SubMenuC4103) menuC4903).f13689;
        InterfaceC3370 interfaceC3370 = c4718.f15554;
        if (interfaceC3370 != null) {
            return interfaceC3370.mo2761(menuC4903);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public void m8691(String str, String str2) {
        AbstractC4225.m7480(str);
        AbstractC4225.m7454(str2, str);
        m8690(str, str2);
    }

    /* JADX INFO: renamed from: ۥٖ */
    public void m8692(String str, String str2) {
        if (str.length() <= 0) {
            C1078.m2272("name is empty");
            return;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('!' > cCharAt || cCharAt >= 127) {
                C1078.m2273(AbstractC4031.m7228("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str));
                return;
            }
        }
        m8690(str, str2);
    }

    /* JADX INFO: renamed from: ۥٙ */
    public AbstractC1996 m8693() {
        return (AbstractC1996) ((C4994) this.f16877).getValue();
    }

    /* JADX INFO: renamed from: ۥۖ */
    public long m8694() {
        long j;
        Parcel parcel = (Parcel) this.f16877;
        byte b = parcel.readByte();
        if (b == 1) {
            j = 4294967296L;
        } else {
            j = b == 2 ? 8589934592L : 0L;
        }
        return C3970.m7128(j, 0L) ? C5023.f16620 : AbstractC4489.m7799(parcel.readFloat(), j);
    }

    @Override // p000.InterfaceC4988
    /* JADX INFO: renamed from: ۥۗ */
    public void mo4405(C5772 c5772, Bitmap bitmap, Map map) {
        ((C0322) this.f16877).m693(c5772, bitmap, map, AbstractC0487.m1052(bitmap));
    }

    /* JADX INFO: renamed from: ۥۙ */
    public void m8695(String str, String str2) {
        AbstractC4225.m7480(str);
        AbstractC4225.m7454(str2, str);
        m8689(str);
        m8690(str, str2);
    }

    @Override // p000.InterfaceC3370
    /* JADX INFO: renamed from: ۥۣ */
    public void mo2765(MenuC4903 menuC4903, boolean z) {
        if (menuC4903 instanceof SubMenuC4103) {
            ((SubMenuC4103) menuC4903).f13690.mo7310().m8297(false);
        }
        InterfaceC3370 interfaceC3370 = ((C4718) this.f16877).f15554;
        if (interfaceC3370 != null) {
            interfaceC3370.mo2765(menuC4903, z);
        }
    }

    /* JADX INFO: renamed from: ۥۦ */
    public void m8696(int i, Object obj, InterfaceC1622 interfaceC1622) {
        C2100 c2100 = (C2100) this.f16877;
        c2100.m4066(i, 3);
        interfaceC1622.mo3389((AbstractC0066) obj, c2100.f6919);
        c2100.m4066(i, 4);
    }

    /* JADX INFO: renamed from: ۥۧ */
    public boolean m8697(C0605 c0605) {
        if (!c0605.m1348()) {
            AbstractC3480.m6278("DepthSortedSet.remove called on an unattached node");
        }
        return ((C5646) this.f16877).remove(c0605);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX INFO: renamed from: ۦؖ */
    public void m8698(AbstractC1996 abstractC1996) {
        Object value;
        AbstractC1996 abstractC1997;
        C4994 c4994 = (C4994) this.f16877;
        do {
            value = c4994.getValue();
            abstractC1997 = (AbstractC1996) value;
            if (abstractC1997 instanceof C0933 ? true : AbstractC3831.m6874(abstractC1997, C2469.f8243)) {
                abstractC1997 = abstractC1996;
            } else if (abstractC1997 instanceof C4127) {
                if (abstractC1996.f6579 > abstractC1997.f6579) {
                    abstractC1997 = abstractC1996;
                }
            } else if (!(abstractC1997 instanceof C4027)) {
                C1078.m2275();
                return;
            }
        } while (!c4994.m8386(value, abstractC1997));
    }

    /* JADX INFO: renamed from: ۦؙ */
    public void m8699(float f, float f2) {
        ((C2808) this.f16877).m5353().mo2085(f, f2);
    }

    @Override // p000.InterfaceC3814
    /* JADX INFO: renamed from: ۦؚ */
    public C3580 mo4409(Object obj) {
        C5040 c5040 = (C5040) obj;
        C4743 c4743 = ((CallableC2838) this.f16877).f9476;
        if (c5040 == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
            return AbstractC5378.m9075(null);
        }
        C5680 c5680 = C4743.f15653;
        return AbstractC5378.m9074(Arrays.asList(c4743.m8070(), c4743.f15663.m6368(null, (ExecutorC2291) c4743.f15655.f9378)));
    }

    @Override // p000.InterfaceC2142
    /* JADX INFO: renamed from: ۦِ */
    public void mo844(Uri uri) {
        ((ContentInfo.Builder) this.f16877).setLinkUri(uri);
    }

    /* JADX INFO: renamed from: ۦٕ */
    public String m8700(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            C0639 c0639 = (C0639) this.f16877;
            C3413 c3413 = new C3413(stringWriter, c0639.f2397, c0639.f2396, c0639.f2394, c0639.f2395);
            c3413.m6179(obj);
            c3413.m6182();
            c3413.f11368.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    /* JADX INFO: renamed from: ۦٗ */
    public C4714 m8701() {
        return new C4714((String[]) ((ArrayList) this.f16877).toArray(new String[0]));
    }

    /* JADX INFO: renamed from: ۦٚ */
    public void m8702(float f, float f2, long j) {
        InterfaceC3212 interfaceC3212M5353 = ((C2808) this.f16877).m5353();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        interfaceC3212M5353.mo2085(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        interfaceC3212M5353.mo2088(f, f2);
        interfaceC3212M5353.mo2085(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    @Override // p000.InterfaceC0891
    /* JADX INFO: renamed from: ۦۗ */
    public void mo1882(Bundle bundle) {
        C0354 c0354 = (C0354) ((InterfaceC4188) this.f16877);
        c0354.getClass();
        if (AbstractC1389.f4744.contains("clx") || AbstractC1389.f4745.contains("_ae")) {
            return;
        }
        C4645 c4645 = AbstractC1389.f4747;
        int i = c4645.f15322;
        int i2 = 0;
        while (i2 < i) {
            boolean zContainsKey = bundle.containsKey((String) c4645.get(i2));
            i2++;
            if (zContainsKey) {
                return;
            }
        }
        bundle.putLong("_r", 1L);
        c0354.f1293.logEvent("clx", "_ae", bundle);
    }

    @Override // p000.InterfaceC4988
    /* JADX INFO: renamed from: ۦۙ */
    public C2431 mo4416(C5772 c5772) {
        return null;
    }

    @Override // p000.InterfaceC1981
    /* JADX INFO: renamed from: ۦۚ */
    public void mo3870(String str, Bundle bundle) {
        C2202 c2202 = (C2202) this.f16877;
        if (c2202 != null) {
            try {
                String str2 = "$A$:" + m8685(str, bundle);
                C3525 c3525 = c2202.f7295;
                c3525.getClass();
                ((ExecutorC2291) c3525.f11687.f9378).m4345(new CallableC3283(c3525, System.currentTimeMillis() - c3525.f11679, str2));
            } catch (JSONException unused) {
                Log.w("FirebaseCrashlytics", "Unable to serialize Firebase Analytics event to breadcrumb.", null);
            }
        }
    }

    /* JADX INFO: renamed from: ۦۛ */
    public long m8703() {
        int i = C1327.f4593;
        long j = ((Parcel) this.f16877).readLong();
        long j2 = 63 & j;
        return j2 < 16 ? j : (j & (-64)) | (j2 + 1);
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public void m8704(C0605 c0605) {
        if (!c0605.m1348()) {
            AbstractC3480.m6278("DepthSortedSet.add called on an unattached node");
        }
        ((C5646) this.f16877).add(c0605);
    }

    @Override // p000.InterfaceC2142
    /* JADX INFO: renamed from: ۦۨ */
    public void mo845(int i) {
        ((ContentInfo.Builder) this.f16877).setFlags(i);
    }

    @Override // p000.InterfaceC4988
    /* JADX INFO: renamed from: ۥۜ */
    public void mo4406(int i) {
    }

    @Override // p000.InterfaceC2262
    /* JADX INFO: renamed from: ۦؑ */
    public void mo4304(int i) {
    }

    @Override // p000.InterfaceC2262
    /* JADX INFO: renamed from: ۦٛ */
    public void mo4306(int i) {
    }

    /* JADX INFO: renamed from: ۦٌ */
    public void mo4305(int i, float f) {
    }

    public /* synthetic */ C5086(int i, boolean z) {
        this.f16878 = i;
    }

    public /* synthetic */ C5086(int i, Object obj) {
        this.f16878 = i;
        this.f16877 = obj;
    }

    public C5086(AbstractC4150 abstractC4150) {
        this.f16878 = 7;
        Objects.requireNonNull(abstractC4150);
        this.f16877 = abstractC4150;
    }

    public C5086(C2100 c2100) {
        this.f16878 = 11;
        Charset charset = AbstractC3576.f11899;
        this.f16877 = c2100;
        c2100.f6919 = this;
    }

    public C5086(C2711 c2711) {
        this.f16878 = 9;
        this.f16877 = new File((File) c2711.f8980, "com.crashlytics.settings.json");
    }

    public C5086(boolean z) {
        this.f16878 = 6;
        this.f16877 = new AtomicBoolean(z);
    }

    public C5086(EditText editText) {
        this.f16878 = 22;
        this.f16877 = new C5002(editText, 26);
    }

    public C5086(CallableC2838 callableC2838, String str) {
        this.f16878 = 15;
        this.f16877 = callableC2838;
    }

    public C5086(String str) {
        this.f16878 = 18;
        Parcel parcelObtain = Parcel.obtain();
        this.f16877 = parcelObtain;
        byte[] bArrDecode = Base64.decode(str, 0);
        parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
        parcelObtain.setDataPosition(0);
    }

    public C5086(ClipData clipData, int i) {
        this.f16878 = 13;
        this.f16877 = AbstractC4759.m8086(clipData, i);
    }
}
