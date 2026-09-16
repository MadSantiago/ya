package p000;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: ۦَؒؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3117 extends AbstractC2474 {

    /* JADX INFO: renamed from: ۥَ */
    public long f10443;

    /* JADX INFO: renamed from: ۥٓ */
    public long f10444;

    /* JADX INFO: renamed from: ۥؓ */
    public static final C5057 m5697(String str, C5580 c5580) {
        for (C5057 c5057 : c5580.m9411()) {
            if (c5057.m8588().equals(str)) {
                return c5057;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥؔ */
    public static final void m5698(StringBuilder sb, int i, String str, C2854 c2854) {
        String str2;
        if (c2854 == null) {
            return;
        }
        m5706(i, sb);
        sb.append(str);
        sb.append(" {\n");
        if (c2854.m5422()) {
            int iM5426 = c2854.m5426();
            if (iM5426 == 1) {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            } else if (iM5426 == 2) {
                str2 = "LESS_THAN";
            } else if (iM5426 != 3) {
                str2 = iM5426 != 4 ? "BETWEEN" : "EQUAL";
            } else {
                str2 = "GREATER_THAN";
            }
            m5715(sb, i, "comparison_type", str2);
        }
        if (c2854.m5421()) {
            m5715(sb, i, "match_as_float", Boolean.valueOf(c2854.m5423()));
        }
        if (c2854.m5428()) {
            m5715(sb, i, "comparison_value", c2854.m5429());
        }
        if (c2854.m5425()) {
            m5715(sb, i, "min_comparison_value", c2854.m5427());
        }
        if (c2854.m5424()) {
            m5715(sb, i, "max_comparison_value", c2854.m5420());
        }
        m5706(i, sb);
        sb.append("}\n");
    }

    /* JADX INFO: renamed from: ۥؖ */
    public static final Bundle m5699(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5057 c5057 = (C5057) it.next();
            String strM8588 = c5057.m8588();
            if (c5057.m8586()) {
                bundle.putDouble(strM8588, c5057.m8584());
            } else if (c5057.m8601()) {
                bundle.putFloat(strM8588, c5057.m8592());
            } else if (c5057.m8591()) {
                bundle.putString(strM8588, c5057.m8603());
            } else if (c5057.m8604()) {
                bundle.putLong(strM8588, c5057.m8593());
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: ۥؙ */
    public static ArrayList m5700(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۥؚ */
    public static boolean m5701(InterfaceC1269 interfaceC1269, int i) {
        if (i < ((C4416) interfaceC1269).f14559 * 64) {
            return ((1 << (i % 64)) & ((Long) ((C4416) interfaceC1269).get(i / 64)).longValue()) != 0;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥً */
    public static final Serializable m5702(String str, C5580 c5580) {
        C5057 c5057M5697 = m5697(str, c5580);
        if (c5057M5697 == null) {
            return null;
        }
        return m5708(c5057M5697);
    }

    /* JADX INFO: renamed from: ۥِ */
    public static int m5703(String str, C4192 c4192) {
        for (int i = 0; i < ((C2523) c4192.f3388).m9828(); i++) {
            if (str.equals(((C2523) c4192.f3388).m9842(i).m6206())) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۥٙ */
    public static final void m5704(C4102 c4102, String str, Long l) {
        List listM7300 = c4102.m7300();
        int i = 0;
        while (true) {
            if (i >= listM7300.size()) {
                i = -1;
                break;
            } else if (str.equals(((C5057) listM7300.get(i)).m8588())) {
                break;
            } else {
                i++;
            }
        }
        C5330 c5330M8583 = C5057.m8583();
        c5330M8583.m8934(str);
        c5330M8583.m8935(l.longValue());
        if (i < 0) {
            c4102.m7296(c5330M8583);
        } else {
            c4102.m1979();
            ((C5580) c4102.f3388).m9418(i, (C5057) c5330M8583.m1977());
        }
    }

    /* JADX INFO: renamed from: ۥۘ */
    public static Bundle[] m5705(InterfaceC5083 interfaceC5083) {
        ArrayList arrayList = new ArrayList();
        Iterator it = interfaceC5083.iterator();
        while (it.hasNext()) {
            C5057 c5057 = (C5057) it.next();
            if (c5057 != null) {
                Bundle bundle = new Bundle();
                for (C5057 c5058 : c5057.m8596()) {
                    if (c5058.m8591()) {
                        bundle.putString(c5058.m8588(), c5058.m8603());
                    } else if (c5058.m8604()) {
                        bundle.putLong(c5058.m8588(), c5058.m8593());
                    } else if (c5058.m8586()) {
                        bundle.putDouble(c5058.m8588(), c5058.m8584());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* JADX INFO: renamed from: ۥۙ */
    public static final void m5706(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static boolean m5707(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.Bundle[], java.io.Serializable] */
    /* JADX INFO: renamed from: ۥۦ */
    public static final Serializable m5708(C5057 c5057) {
        if (c5057.m8591()) {
            return c5057.m8603();
        }
        if (c5057.m8604()) {
            return Long.valueOf(c5057.m8593());
        }
        if (c5057.m8586()) {
            return Double.valueOf(c5057.m8584());
        }
        if (c5057.m8587() > 0) {
            return m5705(c5057.m8596());
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧ */
    public static final String m5709(String str, Map map) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (entry.getValue() == null || ((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦؔ */
    public static HashMap m5710(Bundle bundle, boolean z) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z2 = obj instanceof Parcelable[];
            if (z2 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    if (z2) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(m5710((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            Object obj2 = arrayList2.get(i);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(m5710((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(m5710((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: ۦؖ */
    public static final String m5711(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۦؗ */
    public static final void m5712(Uri.Builder builder, String[] strArr, Bundle bundle, HashSet hashSet) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(",");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                m5713(builder, str3, string, hashSet);
            }
        }
    }

    /* JADX INFO: renamed from: ۦؙ */
    public static final void m5713(Uri.Builder builder, String str, String str2, HashSet hashSet) {
        if (hashSet.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    /* JADX INFO: renamed from: ۦُ */
    public static final void m5714(StringBuilder sb, String str, C3906 c3906) {
        if (c3906 == null) {
            return;
        }
        m5706(3, sb);
        sb.append(str);
        sb.append(" {\n");
        if (c3906.m6993() != 0) {
            m5706(4, sb);
            sb.append("results: ");
            int i = 0;
            for (Long l : c3906.m6984()) {
                int i2 = i + 1;
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i = i2;
            }
            sb.append('\n');
        }
        if (c3906.m6981() != 0) {
            m5706(4, sb);
            sb.append("status: ");
            int i3 = 0;
            for (Long l2 : c3906.m6982()) {
                int i4 = i3 + 1;
                if (i3 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i3 = i4;
            }
            sb.append('\n');
        }
        if (c3906.m6986() != 0) {
            m5706(4, sb);
            sb.append("dynamic_filter_timestamps: {");
            int i5 = 0;
            for (C3574 c3574 : c3906.m6995()) {
                int i6 = i5 + 1;
                if (i5 != 0) {
                    sb.append(", ");
                }
                sb.append(c3574.m6378() ? Integer.valueOf(c3574.m6377()) : null);
                sb.append(":");
                sb.append(c3574.m6379() ? Long.valueOf(c3574.m6382()) : null);
                i5 = i6;
            }
            sb.append("}\n");
        }
        if (c3906.m6985() != 0) {
            m5706(4, sb);
            sb.append("sequence_filter_timestamps: {");
            int i7 = 0;
            for (C3415 c3415 : c3906.m6992()) {
                int i8 = i7 + 1;
                if (i7 != 0) {
                    sb.append(", ");
                }
                sb.append(c3415.m6187() ? Integer.valueOf(c3415.m6186()) : null);
                sb.append(": [");
                Iterator it = c3415.m6188().iterator();
                int i9 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i10 = i9 + 1;
                    if (i9 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    i9 = i10;
                }
                sb.append("]");
                i7 = i8;
            }
            sb.append("}\n");
        }
        m5706(3, sb);
        sb.append("}\n");
    }

    /* JADX INFO: renamed from: ۦٖ */
    public static final void m5715(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        m5706(i + 1, sb);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    /* JADX INFO: renamed from: ۦٗ */
    public static C2679 m5716(C0606 c0606) {
        Object obj;
        Bundle bundleM5717 = m5717(c0606.f2279, true);
        String string = (!bundleM5717.containsKey("_o") || (obj = bundleM5717.get("_o")) == null) ? "app" : obj.toString();
        String strM1948 = AbstractC0949.m1948(c0606.f2281, AbstractC1605.f5396, AbstractC1605.f5399);
        if (strM1948 == null) {
            strM1948 = c0606.f2281;
        }
        return new C2679(strM1948, new C5645(bundleM5717), string, c0606.f2280, 0L);
    }

    /* JADX INFO: renamed from: ۦۛ */
    public static Bundle m5717(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(m5717((Map) arrayList.get(i), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: ۦ۠ */
    public static AbstractC0955 m5718(AbstractC0955 abstractC0955, byte[] bArr) throws C5463 {
        C2955 c2955M5520 = C2955.m5520();
        if (c2955M5520 != null) {
            abstractC0955.getClass();
            abstractC0955.m1978(bArr, bArr.length, c2955M5520);
            return abstractC0955;
        }
        abstractC0955.getClass();
        int length = bArr.length;
        int i = AbstractC5529.f18251;
        abstractC0955.m1978(bArr, length, C2955.f9911);
        return abstractC0955;
    }

    /* JADX INFO: renamed from: ۥٕ */
    public final void m5719(StringBuilder sb, int i, C0529 c0529) {
        String str;
        if (c0529 == null) {
            return;
        }
        m5706(i, sb);
        sb.append("filter {\n");
        if (c0529.m1183()) {
            m5715(sb, i, "complement", Boolean.valueOf(c0529.m1180()));
        }
        if (c0529.m1181()) {
            m5715(sb, i, "param_name", ((C5371) this.f18660).f17731.m7145(c0529.m1179()));
        }
        if (c0529.m1177()) {
            int i2 = i + 1;
            C1288 c1288M1176 = c0529.m1176();
            if (c1288M1176 != null) {
                m5706(i2, sb);
                sb.append("string_filter {\n");
                if (c1288M1176.m2720()) {
                    switch (c1288M1176.m2718()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                            str = "REGEXP";
                            break;
                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                            str = "BEGINS_WITH";
                            break;
                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                            str = "ENDS_WITH";
                            break;
                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                            str = "PARTIAL";
                            break;
                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    m5715(sb, i2, "match_type", str);
                }
                if (c1288M1176.m2719()) {
                    m5715(sb, i2, "expression", c1288M1176.m2721());
                }
                if (c1288M1176.m2724()) {
                    m5715(sb, i2, "case_sensitive", Boolean.valueOf(c1288M1176.m2725()));
                }
                if (c1288M1176.m2723() > 0) {
                    m5706(i + 2, sb);
                    sb.append("expression_list {\n");
                    for (String str2 : c1288M1176.m2722()) {
                        m5706(i + 3, sb);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                m5706(i2, sb);
                sb.append("}\n");
            }
        }
        if (c0529.m1178()) {
            m5698(sb, i + 1, "number_filter", c0529.m1182());
        }
        m5706(i, sb);
        sb.append("}\n");
    }

    /* JADX INFO: renamed from: ۥ٘ */
    public final C4012 m5720(String str, C4192 c4192, C4102 c4102, String str2) {
        int iIndexOf;
        C0237.m498();
        C5371 c5371 = (C5371) this.f18660;
        C0515 c0515 = c5371.f17715;
        if (!c0515.m1162(str, AbstractC4936.f16284)) {
            return null;
        }
        c5371.f17719.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        HashSet hashSet = new HashSet(Arrays.asList(c0515.m1164(str, AbstractC4936.f16292).split(",")));
        C5034 c5034 = this.f19371;
        C5111 c5111 = c5034.f16690;
        C3040 c3040 = c5034.f16698;
        C3040 c3041 = c5111.f19371.f16698;
        C5034.m8484(c3041);
        String strM5642 = c3041.m5642(str);
        Uri.Builder builder = new Uri.Builder();
        C0515 c0516 = ((C5371) c5111.f18660).f17715;
        builder.scheme(c0516.m1164(str, AbstractC4936.f16309));
        if (TextUtils.isEmpty(strM5642)) {
            builder.authority(c0516.m1164(str, AbstractC4936.f16269));
        } else {
            String strM1164 = c0516.m1164(str, AbstractC4936.f16269);
            StringBuilder sb = new StringBuilder(String.valueOf(strM5642).length() + 1 + String.valueOf(strM1164).length());
            sb.append(strM5642);
            sb.append(".");
            sb.append(strM1164);
            builder.authority(sb.toString());
        }
        builder.path(c0516.m1164(str, AbstractC4936.f16282));
        m5713(builder, "gmp_app_id", ((C2523) c4192.f3388).m4715(), hashSet);
        c0515.m1160();
        m5713(builder, "gmp_version", String.valueOf(161000L), hashSet);
        String strM4669 = ((C2523) c4192.f3388).m4669();
        C2462 c2462 = AbstractC4936.f16311;
        if (c0515.m1162(str, c2462)) {
            C5034.m8484(c3040);
            if (c3040.m5638(str)) {
                strM4669 = "";
            }
        }
        m5713(builder, "app_instance_id", strM4669, hashSet);
        m5713(builder, "rdid", ((C2523) c4192.f3388).m4724(), hashSet);
        m5713(builder, "bundle_id", c4192.m7381(), hashSet);
        String strM7304 = c4102.m7304();
        String strM1948 = AbstractC0949.m1948(strM7304, AbstractC1605.f5399, AbstractC1605.f5396);
        if (true != TextUtils.isEmpty(strM1948)) {
            strM7304 = strM1948;
        }
        m5713(builder, "app_event_name", strM7304, hashSet);
        m5713(builder, "app_version", String.valueOf(((C2523) c4192.f3388).m4670()), hashSet);
        String strM9845 = ((C2523) c4192.f3388).m9845();
        if (c0515.m1162(str, c2462)) {
            C5034.m8484(c3040);
            if (c3040.m5636(str) && !TextUtils.isEmpty(strM9845) && (iIndexOf = strM9845.indexOf(".")) != -1) {
                strM9845 = strM9845.substring(0, iIndexOf);
            }
        }
        m5713(builder, "os_version", strM9845, hashSet);
        m5713(builder, "timestamp", String.valueOf(c4102.m7291()), hashSet);
        if (((C2523) c4192.f3388).m4672()) {
            m5713(builder, "lat", "1", hashSet);
        }
        m5713(builder, "privacy_sandbox_version", String.valueOf(((C2523) c4192.f3388).m4673()), hashSet);
        m5713(builder, "trigger_uri_source", "1", hashSet);
        m5713(builder, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), hashSet);
        m5713(builder, "request_uuid", str2, hashSet);
        List<C5057> listM7300 = c4102.m7300();
        Bundle bundle = new Bundle();
        for (C5057 c5057 : listM7300) {
            String strM8588 = c5057.m8588();
            if (c5057.m8586()) {
                bundle.putString(strM8588, String.valueOf(c5057.m8584()));
            } else if (c5057.m8601()) {
                bundle.putString(strM8588, String.valueOf(c5057.m8592()));
            } else if (c5057.m8591()) {
                bundle.putString(strM8588, c5057.m8603());
            } else if (c5057.m8604()) {
                bundle.putString(strM8588, String.valueOf(c5057.m8593()));
            }
        }
        m5712(builder, c0515.m1164(str, AbstractC4936.f16268).split("\\|"), bundle, hashSet);
        List<C3426> listUnmodifiableList = Collections.unmodifiableList(((C2523) c4192.f3388).m9816());
        Bundle bundle2 = new Bundle();
        for (C3426 c3426 : listUnmodifiableList) {
            String strM6206 = c3426.m6206();
            if (c3426.m6201()) {
                bundle2.putString(strM6206, String.valueOf(c3426.m6211()));
            } else if (c3426.m6207()) {
                bundle2.putString(strM6206, String.valueOf(c3426.m6202()));
            } else if (c3426.m6217()) {
                bundle2.putString(strM6206, c3426.m6219());
            } else if (c3426.m6208()) {
                bundle2.putString(strM6206, String.valueOf(c3426.m6216()));
            }
        }
        m5712(builder, c0515.m1164(str, AbstractC4936.f16348).split("\\|"), bundle2, hashSet);
        m5713(builder, "dma", true != ((C2523) c4192.f3388).m4665() ? "0" : "1", hashSet);
        if (!((C2523) c4192.f3388).m4716().isEmpty()) {
            m5713(builder, "dma_cps", ((C2523) c4192.f3388).m4716(), hashSet);
        }
        if (((C2523) c4192.f3388).m4667()) {
            C3790 c3790M4689 = ((C2523) c4192.f3388).m4689();
            if (!c3790M4689.m6722().isEmpty()) {
                m5713(builder, "dl_gclid", c3790M4689.m6722(), hashSet);
            }
            if (!c3790M4689.m6730().isEmpty()) {
                m5713(builder, "dl_gbraid", c3790M4689.m6730(), hashSet);
            }
            if (!c3790M4689.m6731().isEmpty()) {
                m5713(builder, "dl_gs", c3790M4689.m6731(), hashSet);
            }
            if (c3790M4689.m6735() > 0) {
                m5713(builder, "dl_ss_ts", String.valueOf(c3790M4689.m6735()), hashSet);
            }
            if (!c3790M4689.m6739().isEmpty()) {
                m5713(builder, "mr_gclid", c3790M4689.m6739(), hashSet);
            }
            if (!c3790M4689.m6717().isEmpty()) {
                m5713(builder, "mr_gbraid", c3790M4689.m6717(), hashSet);
            }
            if (!c3790M4689.m6724().isEmpty()) {
                m5713(builder, "mr_gs", c3790M4689.m6724(), hashSet);
            }
            if (c3790M4689.m6720() > 0) {
                m5713(builder, "mr_click_ts", String.valueOf(c3790M4689.m6720()), hashSet);
            }
        }
        return new C4012(jCurrentTimeMillis, builder.build().toString(), 1);
    }

    /* JADX INFO: renamed from: ۥٛ */
    public final C5580 m5721(C1832 c1832) {
        C4102 c4102M9403 = C5580.m9403();
        long j = c1832.f6091;
        c4102M9403.m1979();
        ((C5580) c4102M9403.f3388).m9412(j);
        long j2 = c1832.f6090;
        c4102M9403.m1979();
        ((C5580) c4102M9403.f3388).m9409(j2);
        Bundle bundle = c1832.f6095.f18597;
        for (String str : bundle.keySet()) {
            C5330 c5330M8583 = C5057.m8583();
            c5330M8583.m8934(str);
            Object obj = bundle.get(str);
            AbstractC0487.m1047(obj);
            m5732(c5330M8583, obj);
            c4102M9403.m7296(c5330M8583);
        }
        String str2 = c1832.f6089;
        if (!TextUtils.isEmpty(str2) && bundle.get("_o") == null) {
            C5330 c5330M8584 = C5057.m8583();
            c5330M8584.m8934("_o");
            c5330M8584.m8933(str2);
            c4102M9403.m7295((C5057) c5330M8584.m1977());
        }
        return (C5580) c4102M9403.m1977();
    }

    /* JADX INFO: renamed from: ۥٝ */
    public final Parcelable m5722(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            parcelable = (Parcelable) creator.createFromParcel(parcelObtain);
        } catch (C3805 unused) {
            C3610 c3610 = ((C5371) this.f18660).f17717;
            C5371.m9020(c3610);
            c3610.f12020.m9432("Failed to load parcelable from buffer");
        } finally {
            parcelObtain.recycle();
        }
        return parcelable;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final void m5723(Map map) {
        long epochMilli;
        C5371 c5371 = (C5371) this.f18660;
        String strM5709 = m5709("Date", map);
        if (TextUtils.isEmpty(strM5709)) {
            return;
        }
        try {
            epochMilli = ZonedDateTime.parse(strM5709, DateTimeFormatter.RFC_1123_DATE_TIME).toInstant().toEpochMilli();
        } catch (DateTimeParseException unused) {
            C3610 c3610 = c5371.f17717;
            C5371.m9020(c3610);
            c3610.f12022.m9430(strM5709, "Unable to parse header time, time");
            epochMilli = 0;
        }
        if (epochMilli > 0) {
            c5371.f17719.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            mo6517();
            if (this.f10443 == 0) {
                this.f10444 = jElapsedRealtime;
                this.f10443 = epochMilli;
            }
        }
    }

    /* JADX INFO: renamed from: ۥۡ */
    public final List m5724(InterfaceC1269 interfaceC1269, List list) {
        int i;
        C5371 c5371 = (C5371) this.f18660;
        ArrayList arrayList = new ArrayList(interfaceC1269);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                C3610 c3610 = c5371.f17717;
                C5371.m9020(c3610);
                c3610.f12022.m9430(num, "Ignoring negative bit index to be cleared");
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    C3610 c3611 = c5371.f17717;
                    C5371.m9020(c3611);
                    c3611.f12022.m9434(num, Integer.valueOf(arrayList.size()), "Ignoring bit index greater than bitSet size");
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    /* JADX INFO: renamed from: ۥۤ */
    public final String m5725(C2533 c2533) {
        String str;
        String str2;
        String str3;
        C2545 c2545M4681;
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        if (c2533.m4755()) {
            m5715(sb, 0, "upload_subdomain", c2533.m4759());
        }
        if (c2533.m4760()) {
            m5715(sb, 0, "sgtm_join_id", c2533.m4762());
        }
        for (C2523 c2523 : c2533.m4752()) {
            if (c2523 != null) {
                m5706(1, sb);
                sb.append("bundle {\n");
                if (c2523.m4701()) {
                    m5715(sb, 1, "protocol_version", Integer.valueOf(c2523.m4711()));
                }
                C5371 c5371 = (C5371) this.f18660;
                C0515 c0515 = c5371.f17715;
                C4004 c4004 = c5371.f17731;
                if (c0515.m1162(c2523.m4680(), AbstractC4936.f16331) && c2523.m4707()) {
                    m5715(sb, 1, "session_stitching_token", c2523.m4699());
                }
                m5715(sb, 1, "platform", c2523.m9862());
                if (c2523.m4683()) {
                    m5715(sb, 1, "gmp_version", Long.valueOf(c2523.m4726()));
                }
                if (c2523.m4736()) {
                    m5715(sb, 1, "uploading_gmp_version", Long.valueOf(c2523.m4693()));
                }
                if (c2523.m4696()) {
                    m5715(sb, 1, "dynamite_version", Long.valueOf(c2523.m4684()));
                }
                if (c2523.m4737()) {
                    m5715(sb, 1, "config_version", Long.valueOf(c2523.m4741()));
                }
                m5715(sb, 1, "gmp_app_id", c2523.m4715());
                m5715(sb, 1, "app_id", c2523.m4680());
                m5715(sb, 1, "app_version", c2523.m4678());
                if (c2523.m4725()) {
                    m5715(sb, 1, "app_version_major", Integer.valueOf(c2523.m4670()));
                }
                m5715(sb, 1, "firebase_instance_id", c2523.m4719());
                if (c2523.m4704()) {
                    m5715(sb, 1, "dev_cert_hash", Long.valueOf(c2523.m4675()));
                }
                m5715(sb, 1, "app_store", c2523.m9839());
                if (c2523.m9859()) {
                    m5715(sb, 1, "upload_timestamp_millis", Long.valueOf(c2523.m9814()));
                }
                if (c2523.m9863()) {
                    m5715(sb, 1, "start_timestamp_millis", Long.valueOf(c2523.m9852()));
                }
                if (c2523.m9827()) {
                    m5715(sb, 1, "end_timestamp_millis", Long.valueOf(c2523.m9810()));
                }
                if (c2523.m9856()) {
                    m5715(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(c2523.m9817()));
                }
                if (c2523.m9860()) {
                    m5715(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(c2523.m9806()));
                }
                m5715(sb, 1, "app_instance_id", c2523.m4669());
                m5715(sb, 1, "resettable_device_id", c2523.m4724());
                m5715(sb, 1, "ds_id", c2523.m4688());
                if (c2523.m4686()) {
                    m5715(sb, 1, "limited_ad_tracking", Boolean.valueOf(c2523.m4672()));
                }
                m5715(sb, 1, "os_version", c2523.m9845());
                m5715(sb, 1, "device_model", c2523.m9847());
                m5715(sb, 1, "user_default_language", c2523.m9861());
                if (c2523.m9855()) {
                    m5715(sb, 1, "time_zone_offset_minutes", Integer.valueOf(c2523.m9865()));
                }
                if (c2523.m4729()) {
                    m5715(sb, 1, "bundle_sequential_index", Integer.valueOf(c2523.m4682()));
                }
                if (c2523.m4739()) {
                    m5715(sb, 1, "delivery_index", Integer.valueOf(c2523.m4728()));
                }
                if (c2523.m4712()) {
                    m5715(sb, 1, "service_upload", Boolean.valueOf(c2523.m4703()));
                }
                m5715(sb, 1, "health_monitor", c2523.m4695());
                if (c2523.m4740()) {
                    m5715(sb, 1, "retry_counter", Integer.valueOf(c2523.m4676()));
                }
                if (c2523.m4723()) {
                    m5715(sb, 1, "consent_signals", c2523.m4744());
                }
                if (c2523.m4721()) {
                    m5715(sb, 1, "is_dma_region", Boolean.valueOf(c2523.m4665()));
                }
                if (c2523.m4722()) {
                    m5715(sb, 1, "core_platform_services", c2523.m4716());
                }
                if (c2523.m4714()) {
                    m5715(sb, 1, "consent_diagnostics", c2523.m4717());
                }
                if (c2523.m4734()) {
                    m5715(sb, 1, "target_os_version", Long.valueOf(c2523.m4720()));
                }
                C0237.m498();
                if (c0515.m1162(c2523.m4680(), AbstractC4936.f16284)) {
                    m5715(sb, 1, "ad_services_version", Integer.valueOf(c2523.m4673()));
                    if (c2523.m4730() && (c2545M4681 = c2523.m4681()) != null) {
                        m5706(2, sb);
                        sb.append("attribution_eligibility_status {\n");
                        m5715(sb, 2, "eligible", Boolean.valueOf(c2545M4681.m4779()));
                        m5715(sb, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(c2545M4681.m4778()));
                        m5715(sb, 2, "pre_r", Boolean.valueOf(c2545M4681.m4781()));
                        m5715(sb, 2, "r_extensions_too_old", Boolean.valueOf(c2545M4681.m4787()));
                        m5715(sb, 2, "adservices_extension_too_old", Boolean.valueOf(c2545M4681.m4789()));
                        m5715(sb, 2, "ad_storage_not_allowed", Boolean.valueOf(c2545M4681.m4782()));
                        m5715(sb, 2, "measurement_manager_disabled", Boolean.valueOf(c2545M4681.m4786()));
                        m5706(2, sb);
                        sb.append("}\n");
                    }
                }
                if (c2523.m4667()) {
                    C3790 c3790M4689 = c2523.m4689();
                    m5706(2, sb);
                    sb.append("ad_campaign_info {\n");
                    if (c3790M4689.m6715()) {
                        m5715(sb, 2, "deep_link_gclid", c3790M4689.m6722());
                    }
                    if (c3790M4689.m6732()) {
                        m5715(sb, 2, "deep_link_gbraid", c3790M4689.m6730());
                    }
                    if (c3790M4689.m6726()) {
                        m5715(sb, 2, "deep_link_gad_source", c3790M4689.m6731());
                    }
                    if (c3790M4689.m6723()) {
                        m5715(sb, 2, "deep_link_url", c3790M4689.m6710());
                    }
                    if (c3790M4689.m6733()) {
                        m5715(sb, 2, "deep_link_session_millis", Long.valueOf(c3790M4689.m6735()));
                    }
                    if (c3790M4689.m6708()) {
                        m5715(sb, 2, "market_referrer_gclid", c3790M4689.m6739());
                    }
                    if (c3790M4689.m6741()) {
                        m5715(sb, 2, "market_referrer_gbraid", c3790M4689.m6717());
                    }
                    if (c3790M4689.m6719()) {
                        m5715(sb, 2, "market_referrer_gad_source", c3790M4689.m6724());
                    }
                    if (c3790M4689.m6729()) {
                        m5715(sb, 2, "market_referrer_click_millis", Long.valueOf(c3790M4689.m6720()));
                    }
                    m5706(2, sb);
                    sb.append("}\n");
                }
                if (c2523.m4708()) {
                    m5715(sb, 1, "batching_timestamp_millis", Long.valueOf(c2523.m4690()));
                }
                if (c2523.m4668()) {
                    C1082 c1082M4666 = c2523.m4666();
                    m5706(2, sb);
                    sb.append("sgtm_diagnostics {\n");
                    int iM2291 = c1082M4666.m2291();
                    if (iM2291 == 1) {
                        str2 = "UPLOAD_TYPE_UNKNOWN";
                    } else if (iM2291 == 2) {
                        str2 = "GA_UPLOAD";
                    } else if (iM2291 != 3) {
                        str2 = iM2291 != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD";
                    } else {
                        str2 = "SDK_CLIENT_UPLOAD";
                    }
                    m5715(sb, 2, "upload_type", str2);
                    m5715(sb, 2, "client_upload_eligibility", AbstractC2049.m4002(c1082M4666.m2286()));
                    int iM2288 = c1082M4666.m2288();
                    if (iM2288 == 1) {
                        str3 = "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN";
                    } else if (iM2288 == 2) {
                        str3 = "SERVICE_UPLOAD_ELIGIBLE";
                    } else if (iM2288 == 3) {
                        str3 = "NOT_IN_ROLLOUT";
                    } else if (iM2288 != 4) {
                        str3 = iM2288 != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO";
                    } else {
                        str3 = "MISSING_SGTM_SETTINGS";
                    }
                    m5715(sb, 2, "service_upload_eligibility", str3);
                    m5706(2, sb);
                    sb.append("}\n");
                }
                if (c2523.m4698()) {
                    C5171 c5171M4674 = c2523.m4674();
                    m5706(2, sb);
                    sb.append("consent_info_extra {\n");
                    for (C3607 c3607 : c5171M4674.m8777()) {
                        m5706(3, sb);
                        sb.append("limited_data_modes {\n");
                        int iM6423 = c3607.m6423();
                        if (iM6423 == 1) {
                            str = "CONSENT_TYPE_UNSPECIFIED";
                        } else if (iM6423 == 2) {
                            str = "AD_STORAGE";
                        } else if (iM6423 != 3) {
                            str = iM6423 != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA";
                        } else {
                            str = "ANALYTICS_STORAGE";
                        }
                        m5715(sb, 3, "type", str);
                        int iM6424 = c3607.m6424();
                        m5715(sb, 3, "mode", iM6424 != 1 ? iM6424 != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        m5706(3, sb);
                        sb.append("}\n");
                    }
                    m5706(2, sb);
                    sb.append("}\n");
                }
                InterfaceC5083<C3426> interfaceC5083M9816 = c2523.m9816();
                if (interfaceC5083M9816 != null) {
                    for (C3426 c3426 : interfaceC5083M9816) {
                        if (c3426 != null) {
                            m5706(2, sb);
                            sb.append("user_property {\n");
                            m5715(sb, 2, "set_timestamp_millis", c3426.m6204() ? Long.valueOf(c3426.m6203()) : null);
                            m5715(sb, 2, "name", c4004.m7142(c3426.m6206()));
                            m5715(sb, 2, "string_value", c3426.m6219());
                            m5715(sb, 2, "int_value", c3426.m6208() ? Long.valueOf(c3426.m6216()) : null);
                            m5715(sb, 2, "double_value", c3426.m6201() ? Double.valueOf(c3426.m6211()) : null);
                            m5706(2, sb);
                            sb.append("}\n");
                        }
                    }
                }
                InterfaceC5083<C1971> interfaceC5083M4713 = c2523.m4713();
                if (interfaceC5083M4713 != null) {
                    for (C1971 c1971 : interfaceC5083M4713) {
                        if (c1971 != null) {
                            m5706(2, sb);
                            sb.append("audience_membership {\n");
                            if (c1971.m3863()) {
                                m5715(sb, 2, "audience_id", Integer.valueOf(c1971.m3862()));
                            }
                            if (c1971.m3865()) {
                                m5715(sb, 2, "new_audience", Boolean.valueOf(c1971.m3867()));
                            }
                            m5714(sb, "current_data", c1971.m3864());
                            if (c1971.m3868()) {
                                m5714(sb, "previous_data", c1971.m3869());
                            }
                            m5706(2, sb);
                            sb.append("}\n");
                        }
                    }
                }
                List<C5580> listM9813 = c2523.m9813();
                if (listM9813 != null) {
                    for (C5580 c5580 : listM9813) {
                        if (c5580 != null) {
                            m5706(2, sb);
                            sb.append("event {\n");
                            m5715(sb, 2, "name", c4004.m7146(c5580.m9415()));
                            if (c5580.m9423()) {
                                m5715(sb, 2, "timestamp_millis", Long.valueOf(c5580.m9413()));
                            }
                            if (c0515.m1162(null, AbstractC4936.f19565) && c5580.m9426()) {
                                m5715(sb, 2, "corrected_timestamp_millis", Long.valueOf(c5580.m9410()));
                            }
                            if (c5580.m9406()) {
                                m5715(sb, 2, "previous_timestamp_millis", Long.valueOf(c5580.m9404()));
                            }
                            if (c5580.m9419()) {
                                m5715(sb, 2, "count", Integer.valueOf(c5580.m9407()));
                            }
                            if (c5580.m9425() != 0) {
                                m5730(sb, 2, (InterfaceC5083) c5580.m9411());
                            }
                            m5706(2, sb);
                            sb.append("}\n");
                        }
                    }
                }
                m5706(1, sb);
                sb.append("}\n");
            }
        }
        sb.append("} // End-of-batch\n");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥۥ */
    public final long m5726(byte[] bArr) {
        AbstractC0487.m1047(bArr);
        C5371 c5371 = (C5371) this.f18660;
        C1512 c1512 = c5371.f17721;
        C5371.m9021(c1512);
        c1512.mo6517();
        MessageDigest messageDigestM3194 = C1512.m3194();
        if (messageDigestM3194 != null) {
            return C1512.m3197(messageDigestM3194.digest(bArr));
        }
        C3610 c3610 = c5371.f17717;
        C5371.m9020(c3610);
        c3610.f12020.m9432("Failed to get MD5");
        return 0L;
    }

    /* JADX INFO: renamed from: ۥۨ */
    public final byte[] m5727(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            C3610 c3610 = ((C5371) this.f18660).f17717;
            C5371.m9020(c3610);
            c3610.f12020.m9430(e, "Failed to gzip content");
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۦؒ */
    public final String m5728(C4630 c4630) {
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (c4630.m8016()) {
            m5715(sb, 0, "filter_id", Integer.valueOf(c4630.m8015()));
        }
        m5715(sb, 0, "property_name", ((C5371) this.f18660).f17731.m7142(c4630.m8017()));
        String strM5711 = m5711(c4630.m8022(), c4630.m8019(), c4630.m8018());
        if (!strM5711.isEmpty()) {
            m5715(sb, 0, "filter_type", strM5711);
        }
        m5719(sb, 1, c4630.m8021());
        sb.append("}\n");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final long m5729(long j) {
        mo6517();
        long j2 = this.f10443;
        if (j2 == 0 || j == 0) {
            return 0L;
        }
        return (j2 - this.f10444) + j;
    }

    /* JADX INFO: renamed from: ۦٚ */
    public final void m5730(StringBuilder sb, int i, InterfaceC5083 interfaceC5083) {
        if (interfaceC5083 == null) {
            return;
        }
        int i2 = i + 1;
        Iterator it = interfaceC5083.iterator();
        while (it.hasNext()) {
            C5057 c5057 = (C5057) it.next();
            if (c5057 != null) {
                m5706(i2, sb);
                sb.append("param {\n");
                m5715(sb, i2, "name", c5057.m8589() ? ((C5371) this.f18660).f17731.m7145(c5057.m8588()) : null);
                m5715(sb, i2, "string_value", c5057.m8591() ? c5057.m8603() : null);
                m5715(sb, i2, "int_value", c5057.m8604() ? Long.valueOf(c5057.m8593()) : null);
                m5715(sb, i2, "double_value", c5057.m8586() ? Double.valueOf(c5057.m8584()) : null);
                if (c5057.m8587() > 0) {
                    m5730(sb, i2, c5057.m8596());
                }
                m5706(i2, sb);
                sb.append("}\n");
            }
        }
    }

    /* JADX INFO: renamed from: ۦۜ */
    public final void m5731(C2141 c2141, Object obj) {
        c2141.m1979();
        ((C3426) c2141.f3388).m6214();
        c2141.m1979();
        ((C3426) c2141.f3388).m6210();
        c2141.m1979();
        ((C3426) c2141.f3388).m6215();
        if (obj instanceof String) {
            c2141.m1979();
            ((C3426) c2141.f3388).m6209((String) obj);
        } else if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            c2141.m1979();
            ((C3426) c2141.f3388).m6212(jLongValue);
        } else if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            c2141.m1979();
            ((C3426) c2141.f3388).m6213(dDoubleValue);
        } else {
            C3610 c3610 = ((C5371) this.f18660).f17717;
            C5371.m9020(c3610);
            c3610.f12020.m9430(obj, "Ignoring invalid (type) user attribute value");
        }
    }

    /* JADX INFO: renamed from: ۦۣ */
    public final void m5732(C5330 c5330, Object obj) {
        c5330.m1979();
        ((C5057) c5330.f3388).m8599();
        c5330.m1979();
        ((C5057) c5330.f3388).m8595();
        c5330.m1979();
        ((C5057) c5330.f3388).m8600();
        c5330.m1979();
        ((C5057) c5330.f3388).m8605();
        if (obj instanceof String) {
            c5330.m8933((String) obj);
            return;
        }
        if (obj instanceof Long) {
            c5330.m8935(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            c5330.m1979();
            ((C5057) c5330.f3388).m8598(dDoubleValue);
            return;
        }
        if (!(obj instanceof Bundle[])) {
            C3610 c3610 = ((C5371) this.f18660).f17717;
            C5371.m9020(c3610);
            c3610.f12020.m9430(obj, "Ignoring invalid (type) event param value");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                C5330 c5330M8583 = C5057.m8583();
                for (String str : bundle.keySet()) {
                    C5330 c5330M8584 = C5057.m8583();
                    c5330M8584.m8934(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        c5330M8584.m8935(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        c5330M8584.m8933((String) obj2);
                    } else if (obj2 instanceof Double) {
                        double dDoubleValue2 = ((Double) obj2).doubleValue();
                        c5330M8584.m1979();
                        ((C5057) c5330M8584.f3388).m8598(dDoubleValue2);
                    }
                    c5330M8583.m1979();
                    ((C5057) c5330M8583.f3388).m8602((C5057) c5330M8584.m1977());
                }
                if (((C5057) c5330M8583.f3388).m8587() > 0) {
                    arrayList.add((C5057) c5330M8583.m1977());
                }
            }
        }
        c5330.m1979();
        ((C5057) c5330.f3388).m8585(arrayList);
    }

    /* JADX INFO: renamed from: ۦۧ */
    public final boolean m5733(long j, long j2) {
        if (j == 0 || j2 <= 0) {
            return true;
        }
        ((C5371) this.f18660).f17719.getClass();
        return Math.abs(System.currentTimeMillis() - j) > j2;
    }

    @Override // p000.AbstractC2474
    /* JADX INFO: renamed from: ۥٖ */
    public final void mo2428() {
    }
}
