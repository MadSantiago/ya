package p000;

import android.util.Base64;
import android.util.JsonReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: ۦؗؒٗؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3404 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C5086 f11324;

    static {
        C0639 c0639 = new C0639();
        C0227 c0227 = C0227.f856;
        c0639.m1457(AbstractC3677.class, c0227);
        c0639.m1457(C2822.class, c0227);
        C3768 c3768 = C3768.f12531;
        c0639.m1457(AbstractC1038.class, c3768);
        c0639.m1457(C4113.class, c3768);
        C1121 c1121 = C1121.f3942;
        c0639.m1457(AbstractC2952.class, c1121);
        c0639.m1457(C4880.class, c1121);
        C0321 c0321 = C0321.f1177;
        c0639.m1457(AbstractC2765.class, c0321);
        c0639.m1457(AbstractC2795.class, c0321);
        C2193 c2193 = C2193.f7278;
        c0639.m1457(AbstractC3029.class, c2193);
        c0639.m1457(C1740.class, c2193);
        C1118 c1118 = C1118.f3934;
        c0639.m1457(AbstractC0895.class, c1118);
        c0639.m1457(C5675.class, c1118);
        C4466 c4466 = C4466.f14730;
        c0639.m1457(AbstractC3054.class, c4466);
        c0639.m1457(C2033.class, c4466);
        C2039 c2039 = C2039.f6727;
        c0639.m1457(AbstractC4841.class, c2039);
        c0639.m1457(C3302.class, c2039);
        C4098 c4098 = C4098.f13673;
        c0639.m1457(AbstractC5497.class, c4098);
        c0639.m1457(C2701.class, c4098);
        C4620 c4620 = C4620.f15249;
        c0639.m1457(AbstractC4467.class, c4620);
        c0639.m1457(C3123.class, c4620);
        C3987 c3987 = C3987.f13312;
        c0639.m1457(AbstractC1193.class, c3987);
        c0639.m1457(C0524.class, c3987);
        C2965 c2965 = C2965.f9947;
        c0639.m1457(AbstractC4845.class, c2965);
        c0639.m1457(C3723.class, c2965);
        C2590 c2590 = C2590.f8651;
        c0639.m1457(AbstractC2237.class, c2590);
        c0639.m1457(C4257.class, c2590);
        C5764 c5764 = C5764.f18999;
        c0639.m1457(AbstractC5574.class, c5764);
        c0639.m1457(C5455.class, c5764);
        C0315 c0315 = C0315.f1166;
        c0639.m1457(AbstractC4503.class, c0315);
        c0639.m1457(C3383.class, c0315);
        C2420 c2420 = C2420.f8075;
        c0639.m1457(AbstractC1942.class, c2420);
        c0639.m1457(C4321.class, c2420);
        C0773 c0773 = C0773.f2793;
        c0639.m1457(AbstractC4924.class, c0773);
        c0639.m1457(C5725.class, c0773);
        C1767 c1767 = C1767.f5894;
        c0639.m1457(AbstractC3554.class, c1767);
        c0639.m1457(C1668.class, c1767);
        C2845 c2845 = C2845.f9502;
        c0639.m1457(AbstractC1525.class, c2845);
        c0639.m1457(C5126.class, c2845);
        C0741 c0741 = C0741.f2699;
        c0639.m1457(AbstractC5679.class, c0741);
        c0639.m1457(C0368.class, c0741);
        C1006 c1006 = C1006.f3593;
        c0639.m1457(AbstractC1355.class, c1006);
        c0639.m1457(C5498.class, c1006);
        C3567 c3567 = C3567.f11814;
        c0639.m1457(AbstractC1243.class, c3567);
        c0639.m1457(C4376.class, c3567);
        C3338 c3338 = C3338.f11169;
        c0639.m1457(AbstractC5912.class, c3338);
        c0639.m1457(C4856.class, c3338);
        C2773 c2773 = C2773.f9239;
        c0639.m1457(AbstractC5137.class, c2773);
        c0639.m1457(C1094.class, c2773);
        C0393 c0393 = C0393.f1455;
        c0639.m1457(AbstractC4176.class, c0393);
        c0639.m1457(C0209.class, c0393);
        C0109 c0109 = C0109.f439;
        c0639.m1457(AbstractC1742.class, c0109);
        c0639.m1457(C1403.class, c0109);
        C2930 c2930 = C2930.f9852;
        c0639.m1457(AbstractC5843.class, c2930);
        c0639.m1457(C1275.class, c2930);
        C1995 c1995 = C1995.f6578;
        c0639.m1457(AbstractC1778.class, c1995);
        c0639.m1457(C2076.class, c1995);
        c0639.f2395 = true;
        f11324 = new C5086(26, c0639);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static C0368 m6158(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("key")) {
                strNextString = jsonReader.nextString();
                if (strNextString == null) {
                    C0178.m387("Null key");
                    return null;
                }
            } else if (strNextName.equals("value")) {
                strNextString2 = jsonReader.nextString();
                if (strNextString2 == null) {
                    C0178.m387("Null value");
                    return null;
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (strNextString != null && strNextString2 != null) {
            return new C0368(strNextString, strNextString2);
        }
        StringBuilder sb = new StringBuilder();
        if (strNextString == null) {
            sb.append(" key");
        }
        if (strNextString2 == null) {
            sb.append(" value");
        }
        C1078.m2276(AbstractC3761.m6636("Missing required properties:", sb));
        return null;
    }

    /* JADX INFO: renamed from: ۥُ */
    public static C4257 m6159(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        byte b = 0;
        int iNextInt = 0;
        String strNextString = null;
        String strNextString2 = null;
        List listM6161 = null;
        C4257 c4257M6159 = null;
        while (true) {
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (b == 1 && strNextString != null && listM6161 != null) {
                    return new C4257(strNextString, strNextString2, listM6161, c4257M6159, iNextInt);
                }
                StringBuilder sb = new StringBuilder();
                if (strNextString == null) {
                    sb.append(" type");
                }
                if (listM6161 == null) {
                    sb.append(" frames");
                }
                if ((b & 1) == 0) {
                    sb.append(" overflowCount");
                }
                C1078.m2276(AbstractC3761.m6636("Missing required properties:", sb));
                return null;
            }
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    listM6161 = m6161(jsonReader, new C1078(22));
                    if (listM6161 == null) {
                        C0178.m387("Null frames");
                        return null;
                    }
                    break;
                    break;
                case "reason":
                    strNextString2 = jsonReader.nextString();
                    break;
                case "type":
                    strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        C0178.m387("Null type");
                        return null;
                    }
                    break;
                    break;
                case "causedBy":
                    c4257M6159 = m6159(jsonReader);
                    break;
                case "overflowCount":
                    iNextInt = jsonReader.nextInt();
                    b = (byte) (b | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۥّ */
    public static C3723 m6160(JsonReader jsonReader) throws IOException {
        C4325 c4325 = new C4325();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "offset":
                    c4325.f14296 = jsonReader.nextLong();
                    c4325.f14293 = (byte) (c4325.f14293 | 2);
                    break;
                case "symbol":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        C0178.m387("Null symbol");
                        return null;
                    }
                    c4325.f14294 = strNextString;
                    break;
                    break;
                case "pc":
                    c4325.f14295 = jsonReader.nextLong();
                    c4325.f14293 = (byte) (c4325.f14293 | 1);
                    break;
                case "file":
                    c4325.f14291 = jsonReader.nextString();
                    break;
                case "importance":
                    c4325.f14292 = jsonReader.nextInt();
                    c4325.f14293 = (byte) (c4325.f14293 | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return c4325.m7627();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:105:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:13:0x004c  */
    /* JADX WARN: Code duplicated, block: B:193:0x0311  */
    /* JADX WARN: Code duplicated, block: B:60:0x0101  */
    /* JADX INFO: renamed from: ۥۗ */
    public static List m6161(JsonReader jsonReader, C1078 c1078) throws IOException {
        Object objM6160;
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            Object c3383 = null;
            switch (c1078.f3768) {
                case 17:
                    jsonReader.beginObject();
                    String strNextString = null;
                    String strNextString2 = null;
                    String strNextString3 = null;
                    while (true) {
                        if (jsonReader.hasNext()) {
                            String strNextName = jsonReader.nextName();
                            strNextName.getClass();
                            switch (strNextName) {
                                case "libraryName":
                                    strNextString2 = jsonReader.nextString();
                                    if (strNextString2 != null) {
                                        break;
                                    } else {
                                        C0178.m387("Null libraryName");
                                        break;
                                    }
                                    break;
                                case "arch":
                                    strNextString = jsonReader.nextString();
                                    if (strNextString != null) {
                                        break;
                                    } else {
                                        C0178.m387("Null arch");
                                        break;
                                    }
                                    break;
                                case "buildId":
                                    strNextString3 = jsonReader.nextString();
                                    if (strNextString3 != null) {
                                        break;
                                    } else {
                                        C0178.m387("Null buildId");
                                        break;
                                    }
                                    break;
                                default:
                                    jsonReader.skipValue();
                                    break;
                            }
                        } else {
                            jsonReader.endObject();
                            if (strNextString == null || strNextString2 == null || strNextString3 == null) {
                                StringBuilder sb = new StringBuilder();
                                if (strNextString == null) {
                                    sb.append(" arch");
                                }
                                if (strNextString2 == null) {
                                    sb.append(" libraryName");
                                }
                                if (strNextString3 == null) {
                                    sb.append(" buildId");
                                }
                                C1078.m2276(AbstractC3761.m6636("Missing required properties:", sb));
                            } else {
                                c3383 = new C3383(strNextString, strNextString2, strNextString3);
                            }
                        }
                    }
                    objM6160 = c3383;
                    break;
                case 18:
                    jsonReader.beginObject();
                    String strNextString4 = null;
                    byte[] bArrDecode = null;
                    while (true) {
                        if (jsonReader.hasNext()) {
                            String strNextName2 = jsonReader.nextName();
                            strNextName2.getClass();
                            if (strNextName2.equals("filename")) {
                                strNextString4 = jsonReader.nextString();
                                if (strNextString4 == null) {
                                    C0178.m387("Null filename");
                                }
                            } else if (strNextName2.equals("contents")) {
                                bArrDecode = Base64.decode(jsonReader.nextString(), 2);
                                if (bArrDecode == null) {
                                    C0178.m387("Null contents");
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                        } else {
                            jsonReader.endObject();
                            if (strNextString4 == null || bArrDecode == null) {
                                StringBuilder sb2 = new StringBuilder();
                                if (strNextString4 == null) {
                                    sb2.append(" filename");
                                }
                                if (bArrDecode == null) {
                                    sb2.append(" contents");
                                }
                                C1078.m2276(AbstractC3761.m6636("Missing required properties:", sb2));
                            } else {
                                c3383 = new C2076(strNextString4, bArrDecode);
                            }
                        }
                    }
                    objM6160 = c3383;
                    break;
                case 19:
                    C5759 c5759 = new C5759();
                    jsonReader.beginObject();
                    while (true) {
                        if (jsonReader.hasNext()) {
                            String strNextName3 = jsonReader.nextName();
                            strNextName3.getClass();
                            switch (strNextName3) {
                                case "parameterKey":
                                    String strNextString5 = jsonReader.nextString();
                                    if (strNextString5 != null) {
                                        c5759.f18980 = strNextString5;
                                        break;
                                    } else {
                                        C0178.m387("Null parameterKey");
                                        break;
                                    }
                                    break;
                                case "templateVersion":
                                    c5759.f18982 = jsonReader.nextLong();
                                    c5759.f18979 = (byte) (c5759.f18979 | 1);
                                    break;
                                case "rolloutVariant":
                                    jsonReader.beginObject();
                                    String strNextString6 = null;
                                    String strNextString7 = null;
                                    while (true) {
                                        if (!jsonReader.hasNext()) {
                                            jsonReader.endObject();
                                            if (strNextString6 == null || strNextString7 == null) {
                                                StringBuilder sb3 = new StringBuilder();
                                                if (strNextString6 == null) {
                                                    sb3.append(" rolloutId");
                                                }
                                                if (strNextString7 == null) {
                                                    sb3.append(" variantId");
                                                }
                                                C1078.m2276(AbstractC3761.m6636("Missing required properties:", sb3));
                                            } else {
                                                c5759.f18981 = new C1403(strNextString6, strNextString7);
                                            }
                                            break;
                                        } else {
                                            String strNextName4 = jsonReader.nextName();
                                            strNextName4.getClass();
                                            if (strNextName4.equals("variantId")) {
                                                strNextString7 = jsonReader.nextString();
                                                if (strNextString7 == null) {
                                                    C0178.m387("Null variantId");
                                                    break;
                                                }
                                            } else if (strNextName4.equals("rolloutId")) {
                                                strNextString6 = jsonReader.nextString();
                                                if (strNextString6 == null) {
                                                    C0178.m387("Null rolloutId");
                                                    break;
                                                }
                                            } else {
                                                jsonReader.skipValue();
                                            }
                                        }
                                    }
                                    break;
                                case "parameterValue":
                                    String strNextString8 = jsonReader.nextString();
                                    if (strNextString8 != null) {
                                        c5759.f18978 = strNextString8;
                                        break;
                                    } else {
                                        C0178.m387("Null parameterValue");
                                        break;
                                    }
                                    break;
                                default:
                                    jsonReader.skipValue();
                                    break;
                            }
                        } else {
                            jsonReader.endObject();
                            c3383 = c5759.m9575();
                        }
                    }
                    objM6160 = c3383;
                    break;
                case 20:
                    jsonReader.beginObject();
                    byte b = 0;
                    int iNextInt = 0;
                    String strNextString9 = null;
                    List listM6161 = null;
                    while (true) {
                        if (jsonReader.hasNext()) {
                            String strNextName5 = jsonReader.nextName();
                            strNextName5.getClass();
                            switch (strNextName5) {
                                case "frames":
                                    listM6161 = m6161(jsonReader, new C1078(22));
                                    if (listM6161 != null) {
                                        break;
                                    } else {
                                        C0178.m387("Null frames");
                                        break;
                                    }
                                    break;
                                case "name":
                                    strNextString9 = jsonReader.nextString();
                                    if (strNextString9 == null) {
                                        C0178.m387("Null name");
                                        break;
                                    }
                                    break;
                                case "importance":
                                    iNextInt = jsonReader.nextInt();
                                    b = (byte) (b | 1);
                                    break;
                                default:
                                    jsonReader.skipValue();
                                    break;
                            }
                        } else {
                            jsonReader.endObject();
                            if (b != 1 || strNextString9 == null || listM6161 == null) {
                                StringBuilder sb4 = new StringBuilder();
                                if (strNextString9 == null) {
                                    sb4.append(" name");
                                }
                                if ((b & 1) == 0) {
                                    sb4.append(" importance");
                                }
                                if (listM6161 == null) {
                                    sb4.append(" frames");
                                }
                                C1078.m2276(AbstractC3761.m6636("Missing required properties:", sb4));
                            } else {
                                c3383 = new C0524(iNextInt, strNextString9, listM6161);
                            }
                        }
                    }
                    objM6160 = c3383;
                    break;
                case 21:
                    jsonReader.beginObject();
                    byte b2 = 0;
                    String strNextString10 = null;
                    String str = null;
                    long jNextLong = 0;
                    long jNextLong2 = 0;
                    while (true) {
                        if (jsonReader.hasNext()) {
                            String strNextName6 = jsonReader.nextName();
                            strNextName6.getClass();
                            switch (strNextName6) {
                                case "name":
                                    strNextString10 = jsonReader.nextString();
                                    if (strNextString10 != null) {
                                        break;
                                    } else {
                                        C0178.m387("Null name");
                                        break;
                                    }
                                    break;
                                case "size":
                                    b2 = (byte) (b2 | 2);
                                    jNextLong2 = jsonReader.nextLong();
                                    break;
                                case "uuid":
                                    str = new String(Base64.decode(jsonReader.nextString(), 2), AbstractC3677.f12283);
                                    break;
                                case "baseAddress":
                                    b2 = (byte) (b2 | 1);
                                    jNextLong = jsonReader.nextLong();
                                    break;
                                default:
                                    jsonReader.skipValue();
                                    break;
                            }
                        } else {
                            jsonReader.endObject();
                            if (b2 != 3 || strNextString10 == null) {
                                StringBuilder sb5 = new StringBuilder();
                                if ((b2 & 1) == 0) {
                                    sb5.append(" baseAddress");
                                }
                                if ((b2 & 2) == 0) {
                                    sb5.append(" size");
                                }
                                if (strNextString10 == null) {
                                    sb5.append(" name");
                                }
                                C1078.m2276(AbstractC3761.m6636("Missing required properties:", sb5));
                            } else {
                                c3383 = new C5126(jNextLong, jNextLong2, strNextString10, str);
                            }
                        }
                    }
                    objM6160 = c3383;
                    break;
                default:
                    objM6160 = m6160(jsonReader);
                    break;
            }
            arrayList.add(objM6160);
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static C4321 m6162(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        C5725 c5725 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("profilingTrigger")) {
                jsonReader.beginObject();
                boolean z = false;
                int iNextInt = 0;
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    strNextName2.getClass();
                    if (strNextName2.equals("trigger")) {
                        iNextInt = jsonReader.nextInt();
                        z = true;
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                if (!z) {
                    C1078.m2276("Missing required properties: trigger");
                    return null;
                }
                c5725 = new C5725(iNextInt);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (c5725 != null) {
            return new C4321(c5725);
        }
        C1078.m2276("Missing required properties: profilingTrigger");
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C5455 m6163(JsonReader jsonReader) throws IOException {
        C1310 c1310 = new C1310();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    c1310.f4503 = m6161(jsonReader, new C1078(17));
                    break;
                case "pid":
                    c1310.f4500 = jsonReader.nextInt();
                    c1310.f4502 = (byte) (c1310.f4502 | 1);
                    break;
                case "pss":
                    c1310.f4496 = jsonReader.nextLong();
                    c1310.f4502 = (byte) (c1310.f4502 | 8);
                    break;
                case "rss":
                    c1310.f4497 = jsonReader.nextLong();
                    c1310.f4502 = (byte) (c1310.f4502 | 16);
                    break;
                case "timestamp":
                    c1310.f4504 = jsonReader.nextLong();
                    c1310.f4502 = (byte) (c1310.f4502 | 32);
                    break;
                case "processName":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        C0178.m387("Null processName");
                        return null;
                    }
                    c1310.f4498 = strNextString;
                    break;
                    break;
                case "reasonCode":
                    c1310.f4495 = jsonReader.nextInt();
                    c1310.f4502 = (byte) (c1310.f4502 | 2);
                    break;
                case "traceFile":
                    c1310.f4499 = jsonReader.nextString();
                    break;
                case "importance":
                    c1310.f4501 = jsonReader.nextInt();
                    c1310.f4502 = (byte) (c1310.f4502 | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return c1310.m2775();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:111:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:162:0x0260  */
    /* JADX WARN: Code duplicated, block: B:247:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r22v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [ۥِۙؗۙ] */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r23v6 */
    /* JADX WARN: Type inference failed for: r23v7 */
    /* JADX WARN: Type inference failed for: r23v8 */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1, types: [ۦؚۣؑؑ] */
    /* JADX WARN: Type inference failed for: r24v2, types: [ۦٟۡؓٚ] */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [ۥٞؓ٘ؐ] */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r25v8 */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [ۥٙؕ۟ٗ] */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4 */
    /* JADX WARN: Type inference failed for: r27v5 */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX INFO: renamed from: ۦؑ */
    public static C3302 m6164(JsonReader jsonReader) throws IOException {
        byte b;
        C4725 c4725 = new C4725();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "device":
                    b = 0;
                    break;
                case "rollouts":
                    b = 1;
                    break;
                case "app":
                    b = 2;
                    break;
                case "log":
                    b = 3;
                    break;
                case "type":
                    b = 4;
                    break;
                case "timestamp":
                    b = 5;
                    break;
                default:
                    b = -1;
                    break;
            }
            C3302 c3302 = null;
            switch (b) {
                case 0:
                    C5406 c5406 = new C5406();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        switch (strNextName2) {
                            case "batteryLevel":
                                c5406.f17855 = Double.valueOf(jsonReader.nextDouble());
                                break;
                            case "batteryVelocity":
                                c5406.f17854 = jsonReader.nextInt();
                                c5406.f17857 = (byte) (c5406.f17857 | 1);
                                break;
                            case "orientation":
                                c5406.f17856 = jsonReader.nextInt();
                                c5406.f17857 = (byte) (c5406.f17857 | 4);
                                break;
                            case "diskUsed":
                                c5406.f17853 = jsonReader.nextLong();
                                c5406.f17857 = (byte) (c5406.f17857 | 16);
                                break;
                            case "ramUsed":
                                c5406.f17852 = jsonReader.nextLong();
                                c5406.f17857 = (byte) (c5406.f17857 | 8);
                                break;
                            case "proximityOn":
                                c5406.f17851 = jsonReader.nextBoolean();
                                c5406.f17857 = (byte) (c5406.f17857 | 2);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    c4725.f15601 = c5406.m9087();
                    break;
                case 1:
                    jsonReader.beginObject();
                    List listM6161 = null;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        if (strNextName3.equals("assignments")) {
                            listM6161 = m6161(jsonReader, new C1078(19));
                            if (listM6161 == null) {
                                C0178.m387("Null rolloutAssignments");
                                return null;
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (listM6161 == null) {
                        C1078.m2276("Missing required properties: rolloutAssignments");
                        return null;
                    }
                    c4725.f15598 = new C1094(listM6161);
                    break;
                    break;
                case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                    jsonReader.beginObject();
                    C3123 c3123 = null;
                    List listUnmodifiableList = null;
                    List listUnmodifiableList2 = null;
                    Boolean boolValueOf = null;
                    C5498 c5498M6167 = null;
                    List listUnmodifiableList3 = null;
                    boolean z = false;
                    int iNextInt = 0;
                    while (true) {
                        C3302 c3303 = c3302;
                        if (!jsonReader.hasNext()) {
                            jsonReader.endObject();
                            if (z && c3123 != null) {
                                c4725.f15596 = new C2701(c3123, listUnmodifiableList, listUnmodifiableList2, boolValueOf, c5498M6167, listUnmodifiableList3, iNextInt);
                                break;
                            }
                            StringBuilder sb = new StringBuilder();
                            if (c3123 == null) {
                                sb.append(" execution");
                            }
                            if (!z) {
                                sb.append(" uiOrientation");
                            }
                            C1078.m2276(AbstractC3761.m6636("Missing required properties:", sb));
                            return c3303;
                        }
                        String strNextName4 = jsonReader.nextName();
                        strNextName4.getClass();
                        switch (strNextName4) {
                            case "appProcessDetails":
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(m6167(jsonReader));
                                }
                                jsonReader.endArray();
                                listUnmodifiableList3 = Collections.unmodifiableList(arrayList);
                                c3302 = c3303;
                                break;
                            case "background":
                                boolValueOf = Boolean.valueOf(jsonReader.nextBoolean());
                                c3302 = c3303;
                                break;
                            case "execution":
                                jsonReader.beginObject();
                                ?? M6161 = c3303;
                                ?? M6159 = M6161;
                                ?? M6163 = M6159;
                                ?? M6162 = M6163;
                                ?? c1668 = M6162;
                                ?? r27 = c1668;
                                while (jsonReader.hasNext()) {
                                    String strNextName5 = jsonReader.nextName();
                                    strNextName5.getClass();
                                    switch (strNextName5) {
                                        case "appExitInfo":
                                            M6163 = m6163(jsonReader);
                                            break;
                                        case "threads":
                                            M6161 = m6161(jsonReader, new C1078(20));
                                            break;
                                        case "signal":
                                            jsonReader.beginObject();
                                            long jNextLong = 0;
                                            byte b2 = 0;
                                            ?? NextString = c3303;
                                            ?? NextString2 = NextString;
                                            while (jsonReader.hasNext()) {
                                                String strNextName6 = jsonReader.nextName();
                                                strNextName6.getClass();
                                                switch (strNextName6) {
                                                    case "address":
                                                        b2 = (byte) (b2 | 1);
                                                        jNextLong = jsonReader.nextLong();
                                                        break;
                                                    case "code":
                                                        NextString2 = jsonReader.nextString();
                                                        if (NextString2 == 0) {
                                                            C0178.m387("Null code");
                                                            return c3303;
                                                        }
                                                        break;
                                                        break;
                                                    case "name":
                                                        NextString = jsonReader.nextString();
                                                        if (NextString == 0) {
                                                            C0178.m387("Null name");
                                                            return c3303;
                                                        }
                                                        break;
                                                        break;
                                                    default:
                                                        jsonReader.skipValue();
                                                        break;
                                                }
                                            }
                                            jsonReader.endObject();
                                            if (b2 == 1 && NextString != 0 && NextString2 != 0) {
                                                c1668 = new C1668(jNextLong, NextString, NextString2);
                                                break;
                                            } else {
                                                StringBuilder sb2 = new StringBuilder();
                                                if (NextString == 0) {
                                                    sb2.append(" name");
                                                }
                                                if (NextString2 == 0) {
                                                    sb2.append(" code");
                                                }
                                                if ((b2 & 1) == 0) {
                                                    sb2.append(" address");
                                                }
                                                C1078.m2276(AbstractC3761.m6636("Missing required properties:", sb2));
                                                return c3303;
                                            }
                                            break;
                                        case "binaries":
                                            List listM6162 = m6161(jsonReader, new C1078(21));
                                            M6159 = M6159;
                                            M6162 = M6162;
                                            r27 = listM6162;
                                            if (listM6162 == null) {
                                                C0178.m387("Null binaries");
                                                return c3303;
                                            }
                                            break;
                                        case "profilingManagerInfo":
                                            M6159 = M6159;
                                            M6162 = m6162(jsonReader);
                                            r27 = r27;
                                            break;
                                        case "exception":
                                            M6159 = m6159(jsonReader);
                                            M6162 = M6162;
                                            r27 = r27;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            M6159 = M6159;
                                            M6162 = M6162;
                                            r27 = r27;
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                if (c1668 != 0 && r27 != 0) {
                                    c3123 = new C3123(M6161, M6159, M6163, M6162, c1668, r27);
                                    c3302 = c3303;
                                    break;
                                } else {
                                    StringBuilder sb3 = new StringBuilder();
                                    if (c1668 == 0) {
                                        sb3.append(" signal");
                                    }
                                    if (r27 == 0) {
                                        sb3.append(" binaries");
                                    }
                                    C1078.m2276(AbstractC3761.m6636("Missing required properties:", sb3));
                                    return c3303;
                                }
                                break;
                            case "internalKeys":
                                ArrayList arrayList2 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList2.add(m6158(jsonReader));
                                }
                                jsonReader.endArray();
                                listUnmodifiableList2 = Collections.unmodifiableList(arrayList2);
                                c3302 = c3303;
                                break;
                            case "customAttributes":
                                ArrayList arrayList3 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList3.add(m6158(jsonReader));
                                }
                                jsonReader.endArray();
                                listUnmodifiableList = Collections.unmodifiableList(arrayList3);
                                c3302 = c3303;
                                break;
                            case "uiOrientation":
                                iNextInt = jsonReader.nextInt();
                                z = true;
                                c3302 = c3303;
                                break;
                            case "currentProcessDetails":
                                c5498M6167 = m6167(jsonReader);
                                c3302 = c3303;
                                break;
                            default:
                                jsonReader.skipValue();
                                c3302 = c3303;
                                break;
                        }
                    }
                    break;
                case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                    jsonReader.beginObject();
                    String strNextString = null;
                    while (jsonReader.hasNext()) {
                        if (jsonReader.nextName().equals("content")) {
                            strNextString = jsonReader.nextString();
                            if (strNextString == null) {
                                C0178.m387("Null content");
                                return null;
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (strNextString == null) {
                        C1078.m2276("Missing required properties: content");
                        return null;
                    }
                    c4725.f15597 = new C4856(strNextString);
                    break;
                    break;
                case C4261.LONG_FIELD_NUMBER /* 4 */:
                    String strNextString2 = jsonReader.nextString();
                    if (strNextString2 == null) {
                        C0178.m387("Null type");
                        return null;
                    }
                    c4725.f15599 = strNextString2;
                    break;
                    break;
                case C4261.STRING_FIELD_NUMBER /* 5 */:
                    c4725.f15600 = jsonReader.nextLong();
                    c4725.f15602 = (byte) (c4725.f15602 | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return c4725.m8054();
    }

    /* JADX INFO: renamed from: ۦِ */
    public static C2822 m6165(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                C2822 c2822M6166 = m6166(jsonReader);
                jsonReader.close();
                return c2822M6166;
            } catch (Throwable th) {
                try {
                    jsonReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:170:0x0256  */
    /* JADX INFO: renamed from: ۦٛ */
    public static C2822 m6166(JsonReader jsonReader) throws IOException {
        byte b;
        Charset charset = AbstractC3677.f12283;
        C0541 c0541 = new C0541();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "ndkPayload":
                    jsonReader.beginObject();
                    List listM6161 = null;
                    String strNextString = null;
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("files")) {
                            listM6161 = m6161(jsonReader, new C1078(18));
                            if (listM6161 == null) {
                                C0178.m387("Null files");
                                return null;
                            }
                        } else if (strNextName2.equals("orgId")) {
                            strNextString = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (listM6161 == null) {
                        C1078.m2276("Missing required properties: files");
                        return null;
                    }
                    c0541.f1954 = new C1275(listM6161, strNextString);
                    continue;
                    break;
                    break;
                case "sdkVersion":
                    String strNextString2 = jsonReader.nextString();
                    if (strNextString2 == null) {
                        C0178.m387("Null sdkVersion");
                        return null;
                    }
                    c0541.f1948 = strNextString2;
                    break;
                    break;
                case "appQualitySessionId":
                    c0541.f1955 = jsonReader.nextString();
                    break;
                case "appExitInfo":
                    c0541.f1950 = m6163(jsonReader);
                    break;
                case "buildVersion":
                    String strNextString3 = jsonReader.nextString();
                    if (strNextString3 == null) {
                        C0178.m387("Null buildVersion");
                        return null;
                    }
                    c0541.f1947 = strNextString3;
                    break;
                    break;
                case "firebaseAuthenticationToken":
                    c0541.f1945 = jsonReader.nextString();
                    break;
                case "gmpAppId":
                    String strNextString4 = jsonReader.nextString();
                    if (strNextString4 == null) {
                        C0178.m387("Null gmpAppId");
                        return null;
                    }
                    c0541.f1946 = strNextString4;
                    break;
                    break;
                case "installationUuid":
                    String strNextString5 = jsonReader.nextString();
                    if (strNextString5 == null) {
                        C0178.m387("Null installationUuid");
                        return null;
                    }
                    c0541.f1949 = strNextString5;
                    break;
                    break;
                case "firebaseInstallationId":
                    c0541.f1944 = jsonReader.nextString();
                    break;
                case "platform":
                    c0541.f1943 = jsonReader.nextInt();
                    c0541.f1951 = (byte) (c0541.f1951 | 1);
                    break;
                case "displayVersion":
                    String strNextString6 = jsonReader.nextString();
                    if (strNextString6 == null) {
                        C0178.m387("Null displayVersion");
                        return null;
                    }
                    c0541.f1953 = strNextString6;
                    break;
                    break;
                case "session":
                    C1572 c1572 = new C1572();
                    c1572.f5300 = false;
                    c1572.f5306 = (byte) (c1572.f5306 | 2);
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        switch (strNextName3) {
                            case "startedAt":
                                c1572.f5304 = jsonReader.nextLong();
                                c1572.f5306 = (byte) (c1572.f5306 | 1);
                                break;
                            case "appQualitySessionId":
                                c1572.f5298 = jsonReader.nextString();
                                break;
                            case "identifier":
                                c1572.f5301 = new String(Base64.decode(jsonReader.nextString(), 2), AbstractC3677.f12283);
                                break;
                            case "endedAt":
                                c1572.f5299 = Long.valueOf(jsonReader.nextLong());
                                break;
                            case "device":
                                C0224 c0224 = new C0224();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName4 = jsonReader.nextName();
                                    strNextName4.getClass();
                                    switch (strNextName4) {
                                        case "simulator":
                                            c0224.f836 = jsonReader.nextBoolean();
                                            c0224.f841 = (byte) (c0224.f841 | 16);
                                            break;
                                        case "manufacturer":
                                            String strNextString7 = jsonReader.nextString();
                                            if (strNextString7 == null) {
                                                C0178.m387("Null manufacturer");
                                                return null;
                                            }
                                            c0224.f838 = strNextString7;
                                            break;
                                            break;
                                        case "ram":
                                            c0224.f840 = jsonReader.nextLong();
                                            c0224.f841 = (byte) (c0224.f841 | 4);
                                            break;
                                        case "arch":
                                            c0224.f839 = jsonReader.nextInt();
                                            c0224.f841 = (byte) (c0224.f841 | 1);
                                            break;
                                        case "diskSpace":
                                            c0224.f835 = jsonReader.nextLong();
                                            c0224.f841 = (byte) (c0224.f841 | 8);
                                            break;
                                        case "cores":
                                            c0224.f834 = jsonReader.nextInt();
                                            c0224.f841 = (byte) (c0224.f841 | 2);
                                            break;
                                        case "model":
                                            String strNextString8 = jsonReader.nextString();
                                            if (strNextString8 == null) {
                                                C0178.m387("Null model");
                                                return null;
                                            }
                                            c0224.f837 = strNextString8;
                                            break;
                                            break;
                                        case "state":
                                            c0224.f843 = jsonReader.nextInt();
                                            c0224.f841 = (byte) (c0224.f841 | 32);
                                            break;
                                        case "modelClass":
                                            String strNextString9 = jsonReader.nextString();
                                            if (strNextString9 == null) {
                                                C0178.m387("Null modelClass");
                                                return null;
                                            }
                                            c0224.f842 = strNextString9;
                                            break;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                c1572.f5307 = c0224.m480();
                                break;
                            case "events":
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(m6164(jsonReader));
                                }
                                jsonReader.endArray();
                                c1572.f5309 = Collections.unmodifiableList(arrayList);
                                break;
                            case "os":
                                C2185 c2185 = new C2185();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName5 = jsonReader.nextName();
                                    strNextName5.getClass();
                                    switch (strNextName5) {
                                        case "buildVersion":
                                            String strNextString10 = jsonReader.nextString();
                                            if (strNextString10 == null) {
                                                C0178.m387("Null buildVersion");
                                                return null;
                                            }
                                            c2185.f7241 = strNextString10;
                                            break;
                                            break;
                                        case "jailbroken":
                                            c2185.f7245 = jsonReader.nextBoolean();
                                            c2185.f7242 = (byte) (c2185.f7242 | 2);
                                            break;
                                        case "version":
                                            String strNextString11 = jsonReader.nextString();
                                            if (strNextString11 == null) {
                                                C0178.m387("Null version");
                                                return null;
                                            }
                                            c2185.f7243 = strNextString11;
                                            break;
                                            break;
                                        case "platform":
                                            c2185.f7244 = jsonReader.nextInt();
                                            c2185.f7242 = (byte) (c2185.f7242 | 1);
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                c1572.f5308 = c2185.m4238();
                                break;
                            case "app":
                                jsonReader.beginObject();
                                String strNextString12 = null;
                                String strNextString13 = null;
                                String strNextString14 = null;
                                String strNextString15 = null;
                                String strNextString16 = null;
                                String strNextString17 = null;
                                while (jsonReader.hasNext()) {
                                    String strNextName6 = jsonReader.nextName();
                                    strNextName6.getClass();
                                    switch (strNextName6.hashCode()) {
                                        case -1618432855:
                                            if (!strNextName6.equals("identifier")) {
                                                b = -1;
                                            } else {
                                                b = 0;
                                            }
                                            break;
                                        case -519438642:
                                            if (!strNextName6.equals("developmentPlatform")) {
                                                b = -1;
                                            } else {
                                                b = 1;
                                            }
                                            break;
                                        case 213652010:
                                            if (!strNextName6.equals("developmentPlatformVersion")) {
                                                b = -1;
                                            } else {
                                                b = 2;
                                            }
                                            break;
                                        case 351608024:
                                            b = !strNextName6.equals("version") ? (byte) -1 : (byte) 3;
                                            break;
                                        case 719853845:
                                            b = !strNextName6.equals("installationUuid") ? (byte) -1 : (byte) 4;
                                            break;
                                        case 1975623094:
                                            b = !strNextName6.equals("displayVersion") ? (byte) -1 : (byte) 5;
                                            break;
                                        default:
                                            b = -1;
                                            break;
                                    }
                                    switch (b) {
                                        case 0:
                                            strNextString17 = jsonReader.nextString();
                                            if (strNextString17 == null) {
                                                C0178.m387("Null identifier");
                                                return null;
                                            }
                                            break;
                                            break;
                                        case 1:
                                            strNextString15 = jsonReader.nextString();
                                            break;
                                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                                            strNextString16 = jsonReader.nextString();
                                            break;
                                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                                            strNextString12 = jsonReader.nextString();
                                            if (strNextString12 == null) {
                                                C0178.m387("Null version");
                                                return null;
                                            }
                                            break;
                                            break;
                                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                                            strNextString14 = jsonReader.nextString();
                                            break;
                                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                                            strNextString13 = jsonReader.nextString();
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                if (strNextString17 != null && strNextString12 != null) {
                                    c1572.f5310 = new C4880(strNextString17, strNextString12, strNextString13, strNextString14, strNextString15, strNextString16);
                                    break;
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    if (strNextString17 == null) {
                                        sb.append(" identifier");
                                    }
                                    if (strNextString12 == null) {
                                        sb.append(" version");
                                    }
                                    C1078.m2276(AbstractC3761.m6636("Missing required properties:", sb));
                                    return null;
                                }
                                break;
                            case "user":
                                jsonReader.beginObject();
                                String strNextString18 = null;
                                while (jsonReader.hasNext()) {
                                    if (jsonReader.nextName().equals("identifier")) {
                                        strNextString18 = jsonReader.nextString();
                                        if (strNextString18 == null) {
                                            C0178.m387("Null identifier");
                                            return null;
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                if (strNextString18 == null) {
                                    C1078.m2276("Missing required properties: identifier");
                                    return null;
                                }
                                c1572.f5302 = new C1740(strNextString18);
                                break;
                                break;
                            case "generator":
                                String strNextString19 = jsonReader.nextString();
                                if (strNextString19 == null) {
                                    C0178.m387("Null generator");
                                    return null;
                                }
                                c1572.f5303 = strNextString19;
                                break;
                                break;
                            case "crashed":
                                c1572.f5300 = jsonReader.nextBoolean();
                                c1572.f5306 = (byte) (c1572.f5306 | 2);
                                break;
                            case "generatorType":
                                c1572.f5305 = jsonReader.nextInt();
                                c1572.f5306 = (byte) (c1572.f5306 | 4);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    c0541.f1952 = c1572.m3321();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return c0541.m1237();
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static C5498 m6167(JsonReader jsonReader) throws IOException {
        C1376 c1376 = new C1376();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "pid":
                    c1376.f4708 = jsonReader.nextInt();
                    c1376.f4707 = (byte) (c1376.f4707 | 1);
                    break;
                case "processName":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        C0178.m387("Null processName");
                        return null;
                    }
                    c1376.f4709 = strNextString;
                    break;
                    break;
                case "defaultProcess":
                    c1376.f4710 = jsonReader.nextBoolean();
                    c1376.f4707 = (byte) (c1376.f4707 | 4);
                    break;
                case "importance":
                    c1376.f4706 = jsonReader.nextInt();
                    c1376.f4707 = (byte) (c1376.f4707 | 2);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return c1376.m2913();
    }
}
