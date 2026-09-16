package p000;

import android.widget.EdgeEffect;

/* JADX INFO: renamed from: ۦؚؔۜؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3594 {

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ C4545 f11951;

    public C3594(C4545 c4545) {
        this.f11951 = c4545;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0209  */
    /* JADX WARN: Code duplicated, block: B:107:0x0218  */
    /* JADX WARN: Code duplicated, block: B:109:0x0221  */
    /* JADX WARN: Code duplicated, block: B:111:0x0229  */
    /* JADX WARN: Code duplicated, block: B:112:0x022d  */
    /* JADX WARN: Code duplicated, block: B:115:0x023d  */
    /* JADX WARN: Code duplicated, block: B:117:0x0242  */
    /* JADX WARN: Code duplicated, block: B:119:0x024a  */
    /* JADX WARN: Code duplicated, block: B:120:0x024e  */
    /* JADX WARN: Code duplicated, block: B:122:0x0251 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:125:0x0257  */
    /* JADX WARN: Code duplicated, block: B:128:0x025f  */
    /* JADX WARN: Code duplicated, block: B:139:0x029a  */
    /* JADX WARN: Code duplicated, block: B:146:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:148:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:149:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:155:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:162:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:164:0x030a  */
    /* JADX WARN: Code duplicated, block: B:165:0x030e  */
    /* JADX WARN: Code duplicated, block: B:171:0x031e  */
    /* JADX WARN: Code duplicated, block: B:178:0x033b  */
    /* JADX WARN: Code duplicated, block: B:180:0x034c  */
    /* JADX WARN: Code duplicated, block: B:181:0x0350  */
    /* JADX WARN: Code duplicated, block: B:187:0x0360  */
    /* JADX WARN: Code duplicated, block: B:192:0x0368  */
    /* JADX WARN: Code duplicated, block: B:195:0x036c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0116  */
    /* JADX WARN: Code duplicated, block: B:60:0x0119  */
    /* JADX WARN: Code duplicated, block: B:70:0x014c A[PHI: r8
  0x014c: PHI (r8v9 float) = (r8v8 float), (r8v12 float) binds: [B:79:0x017b, B:68:0x0145] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x014f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0157  */
    /* JADX WARN: Code duplicated, block: B:83:0x0198  */
    /* JADX INFO: renamed from: ۥۣ */
    public final long m6402(long j, int i) {
        long j2;
        float fIntBitsToFloat;
        int i2;
        float fM5416;
        float fIntBitsToFloat2;
        long jFloatToRawIntBits;
        long jM3308;
        long jM3309;
        boolean z;
        boolean zM1291;
        boolean z2;
        EdgeEffect edgeEffectM1295;
        float fIntBitsToFloat3;
        C0626 c0626;
        float f;
        EdgeEffect edgeEffectM1294;
        float fIntBitsToFloat4;
        C0626 c0627;
        float f2;
        EdgeEffect edgeEffectM1297;
        float fIntBitsToFloat5;
        C0626 c0628;
        float f3;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        C4545 c4545 = this.f11951;
        c4545.f15019 = i;
        C2851 c2851 = c4545.f15013;
        if (c2851 == null || !(c4545.f15015.mo1391() || c4545.f15015.mo1399())) {
            return c4545.m7866(c4545.f15021, j, i);
        }
        int i5 = c4545.f15019;
        C4545 c4546 = (C4545) c4545.f15018.f16066;
        C0585 c0585 = c2851.f9518;
        if (C3291.m6051(c2851.f9526)) {
            return new C1553(c4546.m7866(c4546.f15021, j, c4546.f15019)).f5241;
        }
        if (!c2851.f9520) {
            if (C0585.m1292(c0585.f2180)) {
                c2851.m5410(0L);
            }
            if (C0585.m1292(c0585.f2188)) {
                c2851.m5416(0L);
            }
            if (C0585.m1292(c0585.f2184)) {
                c2851.m5412(0L);
            }
            if (C0585.m1292(c0585.f2179)) {
                c2851.m5409(0L);
            }
            c2851.f9520 = true;
        }
        int i6 = AbstractC4003.f13345;
        float f4 = i5 == 2 ? 4.0f : 1.0f;
        long jM3305 = C1553.m3305(f4, j);
        int i7 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i7) != 0.0f) {
            if (!C0585.m1292(c0585.f2184) || Float.intBitsToFloat(i7) >= 0.0f) {
                j2 = 4294967295L;
                if (C0585.m1292(c0585.f2179) && Float.intBitsToFloat(i7) > 0.0f) {
                    float fM5409 = c2851.m5409(jM3305);
                    if (!C0585.m1292(c0585.f2179)) {
                        c0585.m1295().finish();
                    }
                    fIntBitsToFloat = fM5409 == Float.intBitsToFloat((int) (jM3305 & 4294967295L)) ? Float.intBitsToFloat(i7) : fM5409 / f4;
                }
            } else {
                float fM5412 = c2851.m5412(jM3305);
                j2 = 4294967295L;
                if (!C0585.m1292(c0585.f2184)) {
                    c0585.m1294().finish();
                }
                fIntBitsToFloat = fM5412 == Float.intBitsToFloat((int) (jM3305 & 4294967295L)) ? Float.intBitsToFloat(i7) : fM5412 / f4;
            }
            i2 = (int) (j >> 32);
            if (Float.intBitsToFloat(i2) != 0.0f) {
                fIntBitsToFloat2 = 0.0f;
            } else if (!C0585.m1292(c0585.f2180) && Float.intBitsToFloat(i2) < 0.0f) {
                fM5416 = c2851.m5410(jM3305);
                if (!C0585.m1292(c0585.f2180)) {
                    c0585.m1293().finish();
                }
                if (fM5416 == Float.intBitsToFloat((int) (jM3305 >> 32))) {
                    fIntBitsToFloat2 = Float.intBitsToFloat(i2);
                } else {
                    fIntBitsToFloat2 = fM5416 / f4;
                }
            } else if (C0585.m1292(c0585.f2188) || Float.intBitsToFloat(i2) <= 0.0f) {
                fIntBitsToFloat2 = 0.0f;
            } else {
                fM5416 = c2851.m5416(jM3305);
                if (!C0585.m1292(c0585.f2188)) {
                    c0585.m1297().finish();
                }
                if (fM5416 == Float.intBitsToFloat((int) (jM3305 >> 32))) {
                    fIntBitsToFloat2 = Float.intBitsToFloat(i2);
                } else {
                    fIntBitsToFloat2 = fM5416 / f4;
                }
            }
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
            if (!C1553.m3306(jFloatToRawIntBits, 0L)) {
                c2851.m5414();
            }
            jM3308 = C1553.m3308(j, jFloatToRawIntBits);
            long j3 = new C1553(c4546.m7866(c4546.f15021, jM3308, c4546.f15019)).f5241;
            jM3309 = C1553.m3308(jM3308, j3);
            if ((Float.intBitsToFloat((int) (jM3308 >> 32)) == 0.0f || Float.intBitsToFloat((int) (jM3308 & j2)) != 0.0f) && ((Float.intBitsToFloat((int) (j3 >> 32)) != 0.0f || Float.intBitsToFloat((int) (j3 & j2)) != 0.0f) && (C0585.m1292(c0585.f2180) || C0585.m1292(c0585.f2184) || C0585.m1292(c0585.f2188) || C0585.m1292(c0585.f2179)))) {
                c2851.m5413();
            }
            if (i5 == 1) {
                i3 = (int) (jM3309 >> 32);
                if (Float.intBitsToFloat(i3) > 0.5f) {
                    c2851.m5410(jM3309);
                } else {
                    if (Float.intBitsToFloat(i3) < -0.5f) {
                        c2851.m5416(jM3309);
                    } else {
                        z3 = false;
                    }
                    i4 = (int) (jM3309 & j2);
                    if (Float.intBitsToFloat(i4) > 1056964608) {
                        c2851.m5412(jM3309);
                    } else {
                        if (Float.intBitsToFloat(i4) < -1090519040) {
                            c2851.m5409(jM3309);
                        } else {
                            z4 = false;
                        }
                        if (!z3 || z4) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    z4 = true;
                    if (z3) {
                    }
                    z = true;
                }
                z3 = true;
                i4 = (int) (jM3309 & j2);
                if (Float.intBitsToFloat(i4) > 1056964608) {
                    c2851.m5412(jM3309);
                } else {
                    if (Float.intBitsToFloat(i4) < -1090519040) {
                        c2851.m5409(jM3309);
                    } else {
                        z4 = false;
                    }
                    if (z3) {
                    }
                    z = true;
                }
                z4 = true;
                if (z3) {
                }
                z = true;
            } else {
                z = false;
            }
            if (!C1553.m3306(jM3308, 0L)) {
                if (C0585.m1291(c0585.f2180) || Float.intBitsToFloat(i2) >= 0.0f) {
                    zM1291 = false;
                } else {
                    EdgeEffect edgeEffectM1293 = c0585.m1293();
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
                    if (edgeEffectM1293 instanceof C0626) {
                        C0626 c0629 = (C0626) edgeEffectM1293;
                        float f5 = c0629.f2322 + fIntBitsToFloat6;
                        c0629.f2322 = f5;
                        if (Math.abs(f5) > c0629.f2323) {
                            c0629.onRelease();
                        }
                    } else {
                        edgeEffectM1293.onRelease();
                    }
                    zM1291 = C0585.m1291(c0585.f2180);
                }
                if (C0585.m1291(c0585.f2188) && Float.intBitsToFloat(i2) > 0.0f) {
                    edgeEffectM1297 = c0585.m1297();
                    fIntBitsToFloat5 = Float.intBitsToFloat(i2);
                    if (edgeEffectM1297 instanceof C0626) {
                        c0628 = (C0626) edgeEffectM1297;
                        f3 = c0628.f2322 + fIntBitsToFloat5;
                        c0628.f2322 = f3;
                        if (Math.abs(f3) > c0628.f2323) {
                            c0628.onRelease();
                        }
                    } else {
                        edgeEffectM1297.onRelease();
                    }
                    if (!zM1291 || C0585.m1291(c0585.f2188)) {
                        zM1291 = true;
                    } else {
                        zM1291 = false;
                    }
                }
                if (C0585.m1291(c0585.f2184) && Float.intBitsToFloat(i7) < 0.0f) {
                    edgeEffectM1294 = c0585.m1294();
                    fIntBitsToFloat4 = Float.intBitsToFloat(i7);
                    if (edgeEffectM1294 instanceof C0626) {
                        c0627 = (C0626) edgeEffectM1294;
                        f2 = c0627.f2322 + fIntBitsToFloat4;
                        c0627.f2322 = f2;
                        if (Math.abs(f2) > c0627.f2323) {
                            c0627.onRelease();
                        }
                    } else {
                        edgeEffectM1294.onRelease();
                    }
                    if (!zM1291 || C0585.m1291(c0585.f2184)) {
                        zM1291 = true;
                    } else {
                        zM1291 = false;
                    }
                }
                if (C0585.m1291(c0585.f2179) && Float.intBitsToFloat(i7) > 0.0f) {
                    edgeEffectM1295 = c0585.m1295();
                    fIntBitsToFloat3 = Float.intBitsToFloat(i7);
                    if (edgeEffectM1295 instanceof C0626) {
                        c0626 = (C0626) edgeEffectM1295;
                        f = c0626.f2322 + fIntBitsToFloat3;
                        c0626.f2322 = f;
                        if (Math.abs(f) > c0626.f2323) {
                            c0626.onRelease();
                        }
                    } else {
                        edgeEffectM1295.onRelease();
                    }
                    if (!zM1291 || C0585.m1291(c0585.f2179)) {
                        zM1291 = true;
                    } else {
                        zM1291 = false;
                    }
                }
                if (!zM1291 || z) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z = z2;
            }
            if (z) {
                c2851.m5414();
            }
            return C1553.m3304(jFloatToRawIntBits, j3);
        }
        j2 = 4294967295L;
        fIntBitsToFloat = 0.0f;
        i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) != 0.0f) {
            fIntBitsToFloat2 = 0.0f;
        } else if (!C0585.m1292(c0585.f2180)) {
            if (C0585.m1292(c0585.f2188)) {
                fIntBitsToFloat2 = 0.0f;
            } else {
                fIntBitsToFloat2 = 0.0f;
            }
        } else if (C0585.m1292(c0585.f2188)) {
            fIntBitsToFloat2 = 0.0f;
        } else {
            fIntBitsToFloat2 = 0.0f;
        }
        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
        if (!C1553.m3306(jFloatToRawIntBits, 0L)) {
            c2851.m5414();
        }
        jM3308 = C1553.m3308(j, jFloatToRawIntBits);
        long j4 = new C1553(c4546.m7866(c4546.f15021, jM3308, c4546.f15019)).f5241;
        jM3309 = C1553.m3308(jM3308, j4);
        if (Float.intBitsToFloat((int) (jM3308 >> 32)) == 0.0f) {
            c2851.m5413();
        } else {
            c2851.m5413();
        }
        if (i5 == 1) {
            i3 = (int) (jM3309 >> 32);
            if (Float.intBitsToFloat(i3) > 0.5f) {
                c2851.m5410(jM3309);
            } else {
                if (Float.intBitsToFloat(i3) < -0.5f) {
                    c2851.m5416(jM3309);
                } else {
                    z3 = false;
                }
                i4 = (int) (jM3309 & j2);
                if (Float.intBitsToFloat(i4) > 1056964608) {
                    c2851.m5412(jM3309);
                } else {
                    if (Float.intBitsToFloat(i4) < -1090519040) {
                        c2851.m5409(jM3309);
                    } else {
                        z4 = false;
                    }
                    if (z3) {
                    }
                    z = true;
                }
                z4 = true;
                if (z3) {
                }
                z = true;
            }
            z3 = true;
            i4 = (int) (jM3309 & j2);
            if (Float.intBitsToFloat(i4) > 1056964608) {
                c2851.m5412(jM3309);
            } else {
                if (Float.intBitsToFloat(i4) < -1090519040) {
                    c2851.m5409(jM3309);
                } else {
                    z4 = false;
                }
                if (z3) {
                }
                z = true;
            }
            z4 = true;
            if (z3) {
            }
            z = true;
        } else {
            z = false;
        }
        if (!C1553.m3306(jM3308, 0L)) {
            if (C0585.m1291(c0585.f2180)) {
                zM1291 = false;
            } else {
                zM1291 = false;
            }
            if (C0585.m1291(c0585.f2188)) {
                edgeEffectM1297 = c0585.m1297();
                fIntBitsToFloat5 = Float.intBitsToFloat(i2);
                if (edgeEffectM1297 instanceof C0626) {
                    c0628 = (C0626) edgeEffectM1297;
                    f3 = c0628.f2322 + fIntBitsToFloat5;
                    c0628.f2322 = f3;
                    if (Math.abs(f3) > c0628.f2323) {
                        c0628.onRelease();
                    }
                } else {
                    edgeEffectM1297.onRelease();
                }
                if (zM1291) {
                    zM1291 = true;
                } else {
                    zM1291 = true;
                }
            }
            if (C0585.m1291(c0585.f2184)) {
                edgeEffectM1294 = c0585.m1294();
                fIntBitsToFloat4 = Float.intBitsToFloat(i7);
                if (edgeEffectM1294 instanceof C0626) {
                    c0627 = (C0626) edgeEffectM1294;
                    f2 = c0627.f2322 + fIntBitsToFloat4;
                    c0627.f2322 = f2;
                    if (Math.abs(f2) > c0627.f2323) {
                        c0627.onRelease();
                    }
                } else {
                    edgeEffectM1294.onRelease();
                }
                if (zM1291) {
                    zM1291 = true;
                } else {
                    zM1291 = true;
                }
            }
            if (C0585.m1291(c0585.f2179)) {
                edgeEffectM1295 = c0585.m1295();
                fIntBitsToFloat3 = Float.intBitsToFloat(i7);
                if (edgeEffectM1295 instanceof C0626) {
                    c0626 = (C0626) edgeEffectM1295;
                    f = c0626.f2322 + fIntBitsToFloat3;
                    c0626.f2322 = f;
                    if (Math.abs(f) > c0626.f2323) {
                        c0626.onRelease();
                    }
                } else {
                    edgeEffectM1295.onRelease();
                }
                if (zM1291) {
                    zM1291 = true;
                } else {
                    zM1291 = true;
                }
            }
            if (zM1291) {
                z2 = true;
            } else {
                z2 = true;
            }
            z = z2;
        }
        if (z) {
            c2851.m5414();
        }
        return C1553.m3304(jFloatToRawIntBits, j4);
    }
}
