package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: ۦؖؖٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C3369 implements InterfaceC0217, InterfaceC3237, InterfaceC4895, InterfaceC0711, InterfaceC5578, InterfaceC1663, InterfaceC4617 {

    /* JADX INFO: renamed from: ۥْ */
    public Object f11254;

    /* JADX INFO: renamed from: ۦ۟ */
    public Object f11255;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f11256;

    public C3369(int i) {
        this.f11256 = i;
        switch (i) {
            case 21:
                this.f11255 = new AtomicInteger();
                this.f11254 = new AtomicInteger();
                break;
            case 22:
                this.f11255 = new C0863(new C0605[16]);
                break;
            default:
                this.f11255 = new C3262();
                this.f11254 = new C3262();
                break;
        }
    }

    /* JADX INFO: renamed from: ۥَ */
    public static C3369 m6127(InterfaceC4507 interfaceC4507) {
        return new C3369(interfaceC4507, ((InterfaceC4680) interfaceC4507).mo651());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [ۥًؗۤ] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [ۥًؗۤ] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX INFO: renamed from: ۦٌ */
    public static void m6128(C0605 c0605) {
        if (c0605.f2274 > 0) {
            if (c0605.f2261.f4244 == 5 && !c0605.m1364() && !c0605.m1324() && !c0605.f2242 && c0605.m1342()) {
                AbstractC5381 abstractC5381 = (AbstractC5381) c0605.f2256.f8210;
                if ((abstractC5381.f17782 & 256) != 0) {
                    while (abstractC5381 != null) {
                        if ((abstractC5381.f17781 & 256) != 0) {
                            ?? M9233 = abstractC5381;
                            ?? c0863 = 0;
                            while (M9233 != 0) {
                                if (M9233 instanceof InterfaceC0882) {
                                    InterfaceC0882 interfaceC0882 = (InterfaceC0882) M9233;
                                    interfaceC0882.mo1728(AbstractC5537.m9245(interfaceC0882, 256));
                                } else if ((M9233.f17781 & 256) != 0 && (M9233 instanceof AbstractC3019)) {
                                    AbstractC5381 abstractC5382 = ((AbstractC3019) M9233).f10167;
                                    int i = 0;
                                    M9233 = M9233;
                                    c0863 = c0863;
                                    while (abstractC5382 != null) {
                                        if ((abstractC5382.f17781 & 256) != 0) {
                                            i++;
                                            if (i == 1) {
                                                c0863 = c0863;
                                                M9233 = abstractC5382;
                                            } else {
                                                if (c0863 == 0) {
                                                    c0863 = new C0863(new AbstractC5381[16]);
                                                }
                                                if (M9233 != 0) {
                                                    c0863.m1843(M9233);
                                                    M9233 = 0;
                                                }
                                                c0863.m1843(abstractC5382);
                                            }
                                        }
                                        abstractC5382 = abstractC5382.f17783;
                                        M9233 = M9233;
                                        c0863 = c0863;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                M9233 = AbstractC5537.m9233(c0863);
                            }
                        }
                        if ((abstractC5381.f17782 & 256) == 0) {
                            break;
                        } else {
                            abstractC5381 = abstractC5381.f17783;
                        }
                    }
                }
            }
            c0605.f2260 = false;
            C0863 c0863M1329 = c0605.m1329();
            Object[] objArr = c0863M1329.f3182;
            int i2 = c0863M1329.f3180;
            for (int i3 = 0; i3 < i2; i3++) {
                m6128((C0605) objArr[i3]);
            }
        }
    }

    @Override // p000.InterfaceC1663
    public void cancel() {
        if (((C5592) this.f11254).compareAndSet(1, 1)) {
            return;
        }
        ((C1597) this.f11255).mo449();
    }

    @Override // p000.InterfaceC4895
    public Object get() {
        return new C0567((Context) ((C0334) this.f11255).f1250, (C2808) ((C4228) this.f11254).get());
    }

    public String toString() {
        int iLastIndexOf;
        switch (this.f11256) {
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                StringBuilder sb = new StringBuilder(128);
                sb.append("LoaderManager{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" in ");
                InterfaceC4507 interfaceC4507 = (InterfaceC4507) this.f11255;
                String simpleName = interfaceC4507.getClass().getSimpleName();
                if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = interfaceC4507.getClass().getName()).lastIndexOf(46)) > 0) {
                    simpleName = simpleName.substring(iLastIndexOf + 1);
                }
                sb.append(simpleName);
                sb.append('{');
                sb.append(Integer.toHexString(System.identityHashCode(interfaceC4507)));
                sb.append("}}");
                return sb.toString();
            case 19:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.f11254.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.f11255;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb2.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: ۥؖ */
    public void m6129(AbstractC0210 abstractC0210) {
        C3262 c3262 = (C3262) this.f11255;
        Object objM6027 = ((C3262) this.f11254).m6027(abstractC0210);
        if (objM6027 != null) {
            if (!(objM6027 instanceof C2730)) {
                C0178.m382();
                return;
            }
            C2730 c2730 = (C2730) objM6027;
            Object[] objArr = c2730.f9041;
            int i = c2730.f9040;
            for (int i2 = 0; i2 < i; i2++) {
                if (objArr[i2] != null) {
                    C0178.m382();
                    return;
                }
                C4618 c4618 = new C4618(abstractC0210);
                Object objM6028 = c3262.m6027(null);
                if (objM6028 != null) {
                    if (objM6028 instanceof C2730) {
                        C2730 c2731 = (C2730) objM6028;
                        int i3 = c2731.f9040;
                        Object[] objArr2 = c2731.f9041;
                        C3046 c3046M7917 = AbstractC4554.m7917(0, i3);
                        int i4 = c3046M7917.f6006;
                        int i5 = c3046M7917.f6005;
                        int i6 = 0;
                        if (i4 <= i5) {
                            while (true) {
                                objArr2[i4 - i6] = objArr2[i4];
                                if (((Boolean) c4618.mo211(objArr2[i4])).booleanValue()) {
                                    i6++;
                                }
                                if (i4 == i5) {
                                    break;
                                } else {
                                    i4++;
                                }
                            }
                        }
                        Arrays.fill(objArr2, i3 - i6, i3, (Object) null);
                        c2731.f9040 -= i6;
                        if (c2731.m5078()) {
                            c3262.m6026(null);
                        }
                        if (c2731.f9040 == 1) {
                            c3262.m6023(null, c2731.m5075());
                        }
                    } else if (((Boolean) c4618.mo211(objM6028)).booleanValue()) {
                        c3262.m6026(null);
                    }
                }
            }
        }
    }

    @Override // p000.InterfaceC4617
    /* JADX INFO: renamed from: ۥؗ */
    public List mo5325(Integer num) {
        List listMo5325 = ((InterfaceC4617) this.f11255).mo5325(null);
        C0126 c0126 = (C0126) this.f11254;
        int i = c0126.f503;
        return i < 0 ? listMo5325 : AbstractC0973.m2049(AbstractC1631.m3427(c0126, num, i, Integer.valueOf(c0126.m262(c0126.f490, i))), listMo5325);
    }

    @Override // p000.InterfaceC3237
    /* JADX INFO: renamed from: ۥّ */
    public void mo2760(C3753 c3753) {
        C1254 c1254 = (C1254) this.f11254;
        c1254.m2653();
        C1165 c1165 = (C1165) c3753.f12486;
        Object[] objArr = c1165.f4043;
        long[] jArr = c1165.f4040;
        int i = c1165.f4041;
        while (i != Integer.MAX_VALUE) {
            int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            Object objM1872 = ((C0880) this.f11255).m1872(obj);
            int iM2654 = c1254.m2654(objM1872);
            int i3 = iM2654 >= 0 ? c1254.f4315[iM2654] : 0;
            if (i3 == 7) {
                c3753.remove(obj);
            } else {
                c1254.m2655(i3 + 1, objM1872);
            }
            i = i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    /* JADX INFO: renamed from: ۥْ */
    public CctBackendFactory m6130(String str) {
        Bundle bundle;
        Object obj;
        Map map = (Map) this.f11254;
        if (map == null) {
            Context context = (Context) this.f11255;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                } else {
                    ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                    if (serviceInfo == null) {
                        Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    } else {
                        bundle = serviceInfo.metaData;
                    }
                    if (bundle == null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap map2 = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            obj = bundle.get(str2);
                            if (!(obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(",", -1)) {
                                    String strTrim = str3.trim();
                                    if (!strTrim.isEmpty()) {
                                        map2.put(strTrim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = map2;
                    }
                    this.f11254 = map;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            bundle = null;
            if (bundle == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                map = Collections.EMPTY_MAP;
            } else {
                HashMap map3 = new HashMap();
                while (r6.hasNext()) {
                    obj = bundle.get(str2);
                    if (!(obj instanceof String)) {
                    }
                }
                map = map3;
            }
            this.f11254 = map;
        }
        String str4 = (String) map.get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e);
            return null;
        } catch (IllegalAccessException e2) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e2);
            return null;
        } catch (InstantiationException e3) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e3);
            return null;
        } catch (NoSuchMethodException e4) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e4);
            return null;
        } catch (InvocationTargetException e5) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e5);
            return null;
        }
    }

    /* JADX INFO: renamed from: ۥٓ */
    public File m6131() {
        if (((File) this.f11255) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f11255) == null) {
                        String str = "PersistedInstallation." + ((C0377) this.f11254).m824() + ".json";
                        C0377 c0377 = (C0377) this.f11254;
                        c0377.m825();
                        File file = new File(c0377.f1410.getNoBackupFilesDir(), str);
                        this.f11255 = file;
                        if (file.exists()) {
                            return (File) this.f11255;
                        }
                        C0377 c0378 = (C0377) this.f11254;
                        c0378.m825();
                        File file2 = new File(c0378.f1410.getFilesDir(), str);
                        if (file2.exists() && !file2.renameTo((File) this.f11255)) {
                            Log.e("PersistedInstallation", "Unable to move the file from back up to non back up directory", new IOException("Unable to move the file from back up to non back up directory"));
                            return file2;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (File) this.f11255;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public InterfaceC3228 m6132() {
        return (InterfaceC3228) ((C4852) this.f11254).getValue();
    }

    /* JADX INFO: renamed from: ۥٙ */
    public C2529 m6133() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(m6131());
            while (true) {
                try {
                    int i = fileInputStream.read(bArr, 0, 16384);
                    if (i < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i2 = C2529.f8371;
        byte b = (byte) (((byte) (0 | 2)) | 1);
        int i3 = AbstractC3761.m6631(5)[iOptInt];
        if (i3 == 0) {
            C0178.m387("Null registrationStatus");
            return null;
        }
        byte b2 = (byte) (((byte) (b | 2)) | 1);
        if (b2 == 3 && i3 != 0) {
            return new C2529(strOptString, i3, strOptString2, strOptString3, jOptLong2, jOptLong, strOptString4);
        }
        StringBuilder sb = new StringBuilder();
        if (i3 == 0) {
            sb.append(" registrationStatus");
        }
        if ((b2 & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((b2 & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        C1078.m2276(AbstractC3761.m6636("Missing required properties:", sb));
        return null;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public void m6134(C2529 c2529) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", c2529.f8376);
            jSONObject.put("Status", AbstractC3761.m6632(c2529.f8375));
            jSONObject.put("AuthToken", c2529.f8372);
            jSONObject.put("RefreshToken", c2529.f8377);
            jSONObject.put("TokenCreationEpochInSecs", c2529.f8374);
            jSONObject.put("ExpiresInSecs", c2529.f8373);
            jSONObject.put("FisError", c2529.f8378);
            C0377 c0377 = (C0377) this.f11254;
            c0377.m825();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", c0377.f1410.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(m6131())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    @Override // p000.InterfaceC0217
    /* JADX INFO: renamed from: ۥۜ */
    public AbstractC0941 mo476(C3131 c3131, C4397 c4397) throws C3754 {
        C2534 c2534 = new C2534(c4397);
        C1414 c1414 = ((C2354) this.f11254).f7802;
        Object obj = ((C5008) c1414.f4870).f16580.get(EnumC2700.f8952);
        if (obj == null) {
            obj = null;
        }
        if (!AbstractC3831.m6874(obj, Boolean.TRUE)) {
            return (AbstractC0941) ((C2354) this.f11254).m4427((C3131) this.f11255, null, c2534);
        }
        String str = c3131.m5775() + '-' + AbstractC2133.m4128();
        C4093 c4093 = new C4093(c3131);
        C4093 c4094 = AbstractC5520.f18228;
        C1489 c1489 = (C1489) c1414.f4869;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c1489.f5058;
        C3223 c3223 = (C3223) ((C1414) c1489.f5059).f4871;
        c3223.m5948("| (+) Scope - id:'" + str + "' q:'" + c4093 + '\'');
        Set set = (Set) c1489.f5057;
        if (!set.contains(c4093)) {
            c3223.m5948("| Scope '" + c4093 + "' not defined. Creating it ...");
            set.add(c4093);
        }
        if (concurrentHashMap.containsKey(str)) {
            throw new C3754(3, AbstractC3761.m6629("Scope with id '", str, "' is already created"));
        }
        C2354 c2354 = new C2354(c4093, str, c4094, (C1414) c1489.f5059, 4);
        C2354[] c2354Arr = {(C2354) c1489.f5056};
        if (c2354.f7801) {
            C1078.m2276("Can't add scope link to a root scope");
            return null;
        }
        c2354.f7803.addAll(0, AbstractC0246.m509(c2354Arr));
        concurrentHashMap.put(str, c2354);
        C2354 c2355 = (C2354) this.f11254;
        if (!c2355.f7801) {
            C2354[] c2354Arr2 = {c2355};
            if (c2354.f7801) {
                C1078.m2276("Can't add scope link to a root scope");
                return null;
            }
            c2354.f7803.addAll(0, AbstractC0246.m509(c2354Arr2));
        }
        AbstractC0941 abstractC0941 = (AbstractC0941) c2354.m4427((C3131) this.f11255, null, c2534);
        C1181 c1181 = new C1181(str, c1414);
        C2763 c2763 = abstractC0941.f3340;
        if (c2763.f9148) {
            C2763.m5116(c1181);
            return abstractC0941;
        }
        synchronized (c2763.f9147) {
            c2763.f9145.add(c1181);
        }
        return abstractC0941;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public void m6135(Object obj, String str) {
        int length = str.length();
        String strValueOf = String.valueOf(obj);
        ((ArrayList) this.f11255).add(AbstractC3761.m6622(new StringBuilder(length + 1 + strValueOf.length()), str, "=", strValueOf));
    }

    @Override // p000.InterfaceC5578
    /* JADX INFO: renamed from: ۦؑ */
    public void mo1168(C2147 c2147) {
        InterfaceC3901 interfaceC3901 = (InterfaceC3901) this.f11255;
        C0724 c0724 = (C0724) this.f11254;
        try {
            try {
                interfaceC3901.mo3082(c0724, c0724.m1601(c2147));
            } catch (Throwable th) {
                AbstractC4554.m7910(th);
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            AbstractC4554.m7910(th2);
            try {
                interfaceC3901.mo3081(th2);
            } catch (Throwable th3) {
                AbstractC4554.m7910(th3);
                th3.printStackTrace();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۦؚ */
    public void m6136() {
        Object[] objArr;
        C0863 c0863 = (C0863) this.f11255;
        Arrays.sort(c0863.f3182, 0, c0863.f3180, C1206.f4153);
        int i = c0863.f3180;
        C0605[] c0605Arr = (C0605[]) this.f11254;
        if (c0605Arr == null || c0605Arr.length < i) {
            objArr = c0605Arr;
            objArr = new C0605[Math.max(16, i)];
        }
        objArr = c0605Arr;
        this.f11254 = null;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c0863.f3182[i2];
        }
        c0863.m1851();
        while (true) {
            i--;
            if (-1 >= i) {
                this.f11254 = objArr;
                return;
            }
            C0605 c0605 = objArr[i];
            if (c0605.f2260) {
                m6128(c0605);
            }
            objArr[i] = 0;
        }
    }

    @Override // p000.InterfaceC0711
    /* JADX INFO: renamed from: ۦِ */
    public StackTraceElement[] mo1576(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        InterfaceC0711[] interfaceC0711Arr = (InterfaceC0711[]) this.f11255;
        StackTraceElement[] stackTraceElementArrMo1576 = stackTraceElementArr;
        for (int i = 0; i < 1; i++) {
            InterfaceC0711 interfaceC0711 = interfaceC0711Arr[i];
            if (stackTraceElementArrMo1576.length <= 1024) {
                break;
            }
            stackTraceElementArrMo1576 = interfaceC0711.mo1576(stackTraceElementArr);
        }
        return stackTraceElementArrMo1576.length > 1024 ? ((C3223) this.f11254).mo1576(stackTraceElementArrMo1576) : stackTraceElementArrMo1576;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۦٕ */
    public void m6137(Drawable drawable) {
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.f11254;
        HashMap map = C2922.f9822;
        C0838 c0838 = (C0838) this.f11255;
        if (map.remove(c0838) == null && atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        if (c0838.getCallback() != null) {
            if (drawable.getBounds().isEmpty()) {
                drawable.setBounds(new Rect(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()));
            }
            c0838.m1750(drawable);
            if (drawable instanceof Animatable) {
                ((Animatable) drawable).start();
            }
        }
    }

    /* JADX INFO: renamed from: ۦٗ */
    public Class m6138() {
        Class cls = (Class) this.f11254;
        if (cls != null) {
            return cls;
        }
        Class clsM4530 = AbstractC2405.m4530(null, (String) this.f11255);
        this.f11254 = clsM4530;
        return clsM4530;
    }

    @Override // p000.InterfaceC5578
    /* JADX INFO: renamed from: ۦٛ */
    public void mo1169(C0201 c0201, IOException iOException) {
        try {
            ((InterfaceC3901) this.f11255).mo3081(iOException);
        } catch (Throwable th) {
            AbstractC4554.m7910(th);
            th.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: ۦۗ */
    public void m6139(List list) {
        C4118 c4118 = (C4118) this.f11254;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0446 c0446 = (C0446) it.next();
            if (c0446.m7287()) {
                AbstractC0881 abstractC0881Mo4833 = c4118.mo4833((String) c0446.f13680);
                if (abstractC0881Mo4833 != null) {
                    abstractC0881Mo4833.mo1876((C1489) this.f11255, c4118, c0446);
                } else {
                    ArrayList arrayList = c0446.f1634;
                    m6139(arrayList == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList));
                }
            }
        }
    }

    @Override // p000.InterfaceC4617
    /* JADX INFO: renamed from: ۦۙ */
    public boolean mo5326() {
        return ((InterfaceC4617) this.f11255).mo5326();
    }

    /* JADX INFO: renamed from: ۦۚ */
    public void m6140(String str, PrintWriter printWriter) {
        C1870 c1870 = ((C5908) this.f11254).f19492;
        if (c1870.f6215 > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            if (c1870.f6215 <= 0) {
                return;
            }
            if (c1870.m3724(0) != null) {
                C0178.m382();
                return;
            }
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(c1870.f6217[0]);
            printWriter.print(": ");
            throw null;
        }
    }

    /* JADX INFO: renamed from: ۦۛ */
    public C3046 m6141() {
        Matcher matcher = (Matcher) this.f11255;
        return AbstractC4554.m7917(matcher.start(), matcher.end());
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public void m6142(C2807 c2807, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap map = (HashMap) this.f11255;
        C4780 c4780 = new C4780(byteArrayOutputStream, map, (HashMap) this.f11254);
        InterfaceC1588 interfaceC1588 = (InterfaceC1588) map.get(C2807.class);
        if (interfaceC1588 != null) {
            interfaceC1588.mo206(c2807, c4780);
        } else {
            throw new C5465("No encoder for " + C2807.class);
        }
    }

    @Override // p000.InterfaceC3237
    /* JADX INFO: renamed from: ۦۨ */
    public boolean mo2768(Object obj, Object obj2) {
        C0880 c0880 = (C0880) this.f11255;
        return AbstractC3831.m6874(c0880.m1872(obj), c0880.m1872(obj2));
    }

    public /* synthetic */ C3369(int i, Object obj, Object obj2, boolean z) {
        this.f11256 = i;
        this.f11254 = obj;
        this.f11255 = obj2;
    }

    public /* synthetic */ C3369(int i, boolean z) {
        this.f11256 = i;
    }

    public /* synthetic */ C3369(Object obj) {
        this.f11256 = 19;
        this.f11254 = obj;
        this.f11255 = new ArrayList();
    }

    public C3369(InterfaceC0711[] interfaceC0711Arr) {
        this.f11256 = 13;
        this.f11255 = interfaceC0711Arr;
        this.f11254 = new C3223(17);
    }

    public C3369(C0605 c0605, InterfaceC3228 interfaceC3228) {
        this.f11256 = 2;
        this.f11255 = c0605;
        this.f11254 = AbstractC2774.m5183(interfaceC3228);
    }

    public C3369(C2384 c2384, C4513 c4513, C3487 c3487) {
        this.f11256 = 25;
        this.f11255 = c2384;
        this.f11254 = c4513;
    }

    public C3369(C1597 c1597) {
        this.f11256 = 23;
        this.f11255 = c1597;
        this.f11254 = new C5592(0);
    }

    public C3369(InterfaceC4507 interfaceC4507, C3160 c3160) {
        this.f11256 = 7;
        this.f11255 = interfaceC4507;
        C1489 c1489 = new C1489(c3160, C5908.f19491, C4390.f14468);
        C3131 c3131M8557 = AbstractC5041.m8557(C5908.class);
        String strM5776 = c3131M8557.m5776();
        if (strM5776 != null) {
            this.f11254 = (C5908) c1489.m3136(c3131M8557, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strM5776));
        } else {
            C1078.m2272("Local and anonymous classes can not be ViewModels");
            throw null;
        }
    }

    public C3369(C0377 c0377) {
        this.f11256 = 26;
        this.f11254 = c0377;
    }

    public C3369(Context context) {
        this.f11256 = 11;
        this.f11254 = null;
        this.f11255 = context;
    }

    public C3369(String str) {
        this.f11256 = 4;
        this.f11255 = str;
    }

    public C3369(C0880 c0880) {
        this.f11256 = 5;
        this.f11255 = c0880;
        C1254 c1254 = AbstractC0664.f2448;
        this.f11254 = new C1254();
    }

    public /* synthetic */ C3369(int i, Object obj, Object obj2) {
        this.f11256 = i;
        this.f11255 = obj;
        this.f11254 = obj2;
    }
}
