package p000;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: ۥؘۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0697 {

    /* JADX INFO: renamed from: ۥۣ */
    public final LinkedHashMap f2527;

    public C0697(int i) {
        switch (i) {
            case 1:
                this.f2527 = new LinkedHashMap(0, 0.75f, true);
                break;
            default:
                this.f2527 = new LinkedHashMap();
                break;
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public void m1549(HashMap map) {
        Object[] objArr;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                value = null;
            } else {
                C3131 c3131M8557 = AbstractC5041.m8557(value.getClass());
                if (!c3131M8557.equals(AbstractC5041.m8557(Boolean.TYPE)) && !c3131M8557.equals(AbstractC5041.m8557(Byte.TYPE)) && !c3131M8557.equals(AbstractC5041.m8557(Integer.TYPE)) && !c3131M8557.equals(AbstractC5041.m8557(Long.TYPE)) && !c3131M8557.equals(AbstractC5041.m8557(Float.TYPE)) && !c3131M8557.equals(AbstractC5041.m8557(Double.TYPE)) && !c3131M8557.equals(AbstractC5041.m8557(String.class)) && !c3131M8557.equals(AbstractC5041.m8557(Boolean[].class)) && !c3131M8557.equals(AbstractC5041.m8557(Byte[].class)) && !c3131M8557.equals(AbstractC5041.m8557(Integer[].class)) && !c3131M8557.equals(AbstractC5041.m8557(Long[].class)) && !c3131M8557.equals(AbstractC5041.m8557(Float[].class)) && !c3131M8557.equals(AbstractC5041.m8557(Double[].class)) && !c3131M8557.equals(AbstractC5041.m8557(String[].class))) {
                    int i = 0;
                    if (c3131M8557.equals(AbstractC5041.m8557(boolean[].class))) {
                        boolean[] zArr = (boolean[]) value;
                        String str2 = AbstractC1621.f5429;
                        int length = zArr.length;
                        objArr = new Boolean[length];
                        while (i < length) {
                            objArr[i] = Boolean.valueOf(zArr[i]);
                            i++;
                        }
                    } else if (c3131M8557.equals(AbstractC5041.m8557(byte[].class))) {
                        byte[] bArr = (byte[]) value;
                        String str3 = AbstractC1621.f5429;
                        int length2 = bArr.length;
                        objArr = new Byte[length2];
                        while (i < length2) {
                            objArr[i] = Byte.valueOf(bArr[i]);
                            i++;
                        }
                    } else if (c3131M8557.equals(AbstractC5041.m8557(int[].class))) {
                        int[] iArr = (int[]) value;
                        String str4 = AbstractC1621.f5429;
                        int length3 = iArr.length;
                        objArr = new Integer[length3];
                        while (i < length3) {
                            objArr[i] = Integer.valueOf(iArr[i]);
                            i++;
                        }
                    } else if (c3131M8557.equals(AbstractC5041.m8557(long[].class))) {
                        long[] jArr = (long[]) value;
                        String str5 = AbstractC1621.f5429;
                        int length4 = jArr.length;
                        objArr = new Long[length4];
                        while (i < length4) {
                            objArr[i] = Long.valueOf(jArr[i]);
                            i++;
                        }
                    } else if (c3131M8557.equals(AbstractC5041.m8557(float[].class))) {
                        float[] fArr = (float[]) value;
                        String str6 = AbstractC1621.f5429;
                        int length5 = fArr.length;
                        objArr = new Float[length5];
                        while (i < length5) {
                            objArr[i] = Float.valueOf(fArr[i]);
                            i++;
                        }
                    } else {
                        if (!c3131M8557.equals(AbstractC5041.m8557(double[].class))) {
                            C2316.m4359("Key ", str, " has invalid type ", c3131M8557);
                            return;
                        }
                        double[] dArr = (double[]) value;
                        String str7 = AbstractC1621.f5429;
                        int length6 = dArr.length;
                        objArr = new Double[length6];
                        while (i < length6) {
                            objArr[i] = Double.valueOf(dArr[i]);
                            i++;
                        }
                    }
                    value = objArr;
                }
            }
            this.f2527.put(str, value);
        }
    }
}
