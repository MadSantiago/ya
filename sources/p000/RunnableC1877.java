package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: ۥٝؔؑؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1877 implements Runnable {

    /* JADX INFO: renamed from: ۥَ */
    public final Map f6225;

    /* JADX INFO: renamed from: ۥْ */
    public final byte[] f6226;

    /* JADX INFO: renamed from: ۥٓ */
    public final String f6227;

    /* JADX INFO: renamed from: ۥٖ */
    public final Object f6228;

    /* JADX INFO: renamed from: ۦٗ */
    public final /* synthetic */ AbstractC5676 f6229;

    /* JADX INFO: renamed from: ۦ۟ */
    public final URL f6230;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f6231 = 0;

    public RunnableC1877(C1518 c1518, String str, URL url, byte[] bArr, Map map, InterfaceC2697 interfaceC2697) {
        Objects.requireNonNull(c1518);
        this.f6229 = c1518;
        AbstractC0487.m1090(str);
        AbstractC0487.m1047(url);
        this.f6230 = url;
        this.f6226 = bArr;
        this.f6228 = interfaceC2697;
        this.f6227 = str;
        this.f6225 = map;
    }

    /* JADX WARN: Code duplicated, block: B:164:0x02be  */
    /* JADX WARN: Code duplicated, block: B:174:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:178:0x02a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x013f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x02e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x0163 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0154  */
    /* JADX WARN: Code duplicated, block: B:91:0x0178  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0, types: [ۥٝؔؑؑ] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.Map] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Throwable th;
        int responseCode;
        HttpURLConnection httpURLConnection;
        IOException iOException;
        Map map;
        RunnableC3788 runnableC3788;
        C3644 c3644;
        InputStream inputStream;
        Throwable th2;
        OutputStream outputStream;
        HttpURLConnection httpURLConnection2;
        ?? r6;
        IOException iOException2;
        OutputStream outputStream2;
        ?? r5;
        String str;
        Object obj;
        String str2;
        InputStream inputStream2;
        int i = this.f6231;
        String str3 = "Content-Encoding";
        byte[] bArr = this.f6226;
        Map map2 = this.f6225;
        URL url = this.f6230;
        AbstractC5676 abstractC5676 = this.f6229;
        int responseCode2 = 0;
        String str4 = this.f6227;
        switch (i) {
            case 0:
                OutputStream outputStream3 = null;
                Map map3 = null;
                outputStream = null;
                outputStream3 = null;
                outputStream = null;
                outputStream3 = null;
                OutputStream outputStream4 = null;
                InterfaceC2697 interfaceC2697 = (InterfaceC2697) this.f6228;
                C1518 c1518 = (C1518) abstractC5676;
                C5371 c5371 = (C5371) c1518.f18660;
                C5371 c5372 = (C5371) c1518.f18660;
                C3644 c3645 = c5371.f17733;
                C5371.m9020(c3645);
                c3645.m6522();
                try {
                    URLConnection uRLConnectionOpenConnection = url.openConnection();
                    if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                        throw new IOException("Failed to obtain HTTP connection");
                    }
                    httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                    httpURLConnection.setDefaultUseCaches(false);
                    C0515 c0515 = c5372.f17715;
                    httpURLConnection.setConnectTimeout(60000);
                    httpURLConnection.setReadTimeout(61000);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoInput(true);
                    if (map2 != null) {
                        try {
                            for (Map.Entry entry : map2.entrySet()) {
                                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                            }
                        } catch (IOException e) {
                            iOException = e;
                            responseCode = 0;
                            map = null;
                            if (outputStream4 != null) {
                                try {
                                    outputStream4.close();
                                } catch (IOException e2) {
                                    C3610 c3610 = c5372.f17717;
                                    C5371.m9020(c3610);
                                    c3610.f12020.m9434(C3610.m6440(str4), e2, "Error closing HTTP compressed POST connection output stream. appId");
                                }
                                break;
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            c3644 = c5372.f17733;
                            C5371.m9020(c3644);
                            runnableC3788 = new RunnableC3788(this.f6227, interfaceC2697, responseCode, iOException, (byte[]) null, map);
                            c3644.m6515(runnableC3788);
                            return;
                        } catch (Throwable th3) {
                            th = th3;
                            responseCode = 0;
                            th = th;
                            if (outputStream3 != null) {
                                try {
                                    outputStream3.close();
                                } catch (IOException e3) {
                                    C3610 c3611 = c5372.f17717;
                                    C5371.m9020(c3611);
                                    c3611.f12020.m9434(C3610.m6440(str4), e3, "Error closing HTTP compressed POST connection output stream. appId");
                                }
                                break;
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            C3644 c3646 = c5372.f17733;
                            C5371.m9020(c3646);
                            c3646.m6515(new RunnableC3788(this.f6227, interfaceC2697, responseCode, (IOException) null, (byte[]) null, map3));
                            throw th;
                        }
                    }
                    if (bArr != null) {
                        C3117 c3117 = c1518.f19371.f16692;
                        C5034.m8484(c3117);
                        byte[] bArrM5727 = c3117.m5727(bArr);
                        C3610 c3612 = c5372.f17717;
                        C5371.m9020(c3612);
                        C5590 c5590 = c3612.f12023;
                        int length = bArrM5727.length;
                        c5590.m9430(Integer.valueOf(length), "Uploading data. size");
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                        httpURLConnection.setFixedLengthStreamingMode(length);
                        httpURLConnection.connect();
                        OutputStream outputStream5 = httpURLConnection.getOutputStream();
                        try {
                            outputStream5.write(bArrM5727);
                            outputStream5.close();
                        } catch (IOException e4) {
                            iOException = e4;
                            responseCode = 0;
                            map = null;
                            outputStream4 = outputStream5;
                            if (outputStream4 != null) {
                                outputStream4.close();
                                break;
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            c3644 = c5372.f17733;
                            C5371.m9020(c3644);
                            runnableC3788 = new RunnableC3788(this.f6227, interfaceC2697, responseCode, iOException, (byte[]) null, map);
                            c3644.m6515(runnableC3788);
                            return;
                        } catch (Throwable th4) {
                            th = th4;
                            responseCode = 0;
                            outputStream3 = outputStream5;
                            httpURLConnection = httpURLConnection;
                            th = th;
                            if (outputStream3 != null) {
                                outputStream3.close();
                                break;
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            C3644 c3647 = c5372.f17733;
                            C5371.m9020(c3647);
                            c3647.m6515(new RunnableC3788(this.f6227, interfaceC2697, responseCode, (IOException) null, (byte[]) null, map3));
                            throw th;
                        }
                    }
                    responseCode = httpURLConnection.getResponseCode();
                    try {
                        try {
                            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                inputStream = httpURLConnection.getInputStream();
                                try {
                                    byte[] bArr2 = new byte[1024];
                                    while (true) {
                                        int i2 = inputStream.read(bArr2);
                                        if (i2 <= 0) {
                                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                                            inputStream.close();
                                            httpURLConnection.disconnect();
                                            c3644 = c5372.f17733;
                                            C5371.m9020(c3644);
                                            runnableC3788 = new RunnableC3788(this.f6227, interfaceC2697, responseCode, (IOException) null, byteArray, headerFields);
                                            c3644.m6515(runnableC3788);
                                            return;
                                        }
                                        byteArrayOutputStream.write(bArr2, 0, i2);
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                inputStream = null;
                            }
                        } catch (IOException e5) {
                            iOException = e5;
                            map = null;
                            if (outputStream4 != null) {
                                outputStream4.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            c3644 = c5372.f17733;
                            C5371.m9020(c3644);
                            runnableC3788 = new RunnableC3788(this.f6227, interfaceC2697, responseCode, iOException, (byte[]) null, map);
                            break;
                        } catch (Throwable th7) {
                            th = th7;
                            th = th;
                            if (outputStream3 != null) {
                                outputStream3.close();
                                break;
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            C3644 c3648 = c5372.f17733;
                            C5371.m9020(c3648);
                            c3648.m6515(new RunnableC3788(this.f6227, interfaceC2697, responseCode, (IOException) null, (byte[]) null, map3));
                            throw th;
                        }
                    } catch (IOException e6) {
                        iOException = e6;
                        if (outputStream4 != null) {
                            outputStream4.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        c3644 = c5372.f17733;
                        C5371.m9020(c3644);
                        runnableC3788 = new RunnableC3788(this.f6227, interfaceC2697, responseCode, iOException, (byte[]) null, map);
                        break;
                    } catch (Throwable th8) {
                        th = th8;
                        httpURLConnection = httpURLConnection;
                        th = th;
                        if (outputStream3 != null) {
                            outputStream3.close();
                            break;
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        C3644 c3649 = c5372.f17733;
                        C5371.m9020(c3649);
                        c3649.m6515(new RunnableC3788(this.f6227, interfaceC2697, responseCode, (IOException) null, (byte[]) null, map3));
                        throw th;
                    }
                } catch (IOException e7) {
                    iOException = e7;
                    responseCode = 0;
                    httpURLConnection = null;
                    map = null;
                } catch (Throwable th9) {
                    th = th9;
                    responseCode = 0;
                    httpURLConnection = null;
                    map3 = null;
                }
                break;
            default:
                C2382 c2382 = (C2382) abstractC5676;
                C5371 c5373 = (C5371) c2382.f18660;
                C5371 c5374 = (C5371) c2382.f18660;
                C3644 c36410 = c5373.f17733;
                C5371.m9020(c36410);
                c36410.m6522();
                try {
                    URLConnection uRLConnectionOpenConnection2 = url.openConnection();
                    if (!(uRLConnectionOpenConnection2 instanceof HttpURLConnection)) {
                        throw new IOException("Failed to obtain HTTP connection");
                    }
                    httpURLConnection2 = (HttpURLConnection) uRLConnectionOpenConnection2;
                    httpURLConnection2.setDefaultUseCaches(false);
                    C0515 c0516 = c5374.f17715;
                    httpURLConnection2.setConnectTimeout(60000);
                    httpURLConnection2.setReadTimeout(61000);
                    httpURLConnection2.setInstanceFollowRedirects(false);
                    httpURLConnection2.setDoInput(true);
                    if (map2 != null) {
                        try {
                            try {
                                for (Map.Entry entry2 : map2.entrySet()) {
                                    httpURLConnection2.addRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                outputStream = null;
                                obj = null;
                                th2 = th;
                                r6 = obj;
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                    } catch (IOException e8) {
                                        C3610 c3613 = c5374.f17717;
                                        C5371.m9020(c3613);
                                        c3613.f12020.m9434(C3610.m6440(str4), e8, "Error closing HTTP compressed POST connection output stream. appId");
                                    }
                                    break;
                                }
                                if (httpURLConnection2 != null) {
                                    httpURLConnection2.disconnect();
                                }
                                m3737(responseCode2, null, null, r6);
                                throw th2;
                            }
                        } catch (IOException e9) {
                            e = e9;
                            str = null;
                            iOException2 = e;
                            outputStream2 = null;
                            r5 = str;
                            if (outputStream2 != null) {
                                try {
                                    outputStream2.close();
                                } catch (IOException e10) {
                                    C3610 c3614 = c5374.f17717;
                                    C5371.m9020(c3614);
                                    c3614.f12020.m9434(C3610.m6440(str4), e10, "Error closing HTTP compressed POST connection output stream. appId");
                                }
                                break;
                            }
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            m3737(responseCode2, iOException2, null, r5);
                            return;
                        }
                    }
                    if (bArr != null) {
                        try {
                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                            gZIPOutputStream.write(bArr);
                            gZIPOutputStream.close();
                            byteArrayOutputStream2.close();
                            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                            C3610 c3615 = c5374.f17717;
                            C5371.m9020(c3615);
                            C5590 c5591 = c3615.f12023;
                            int length2 = byteArray2.length;
                            c5591.m9430(Integer.valueOf(length2), "Uploading data. size");
                            httpURLConnection2.setDoOutput(true);
                            httpURLConnection2.addRequestProperty("Content-Encoding", "gzip");
                            httpURLConnection2.setFixedLengthStreamingMode(length2);
                            httpURLConnection2.connect();
                            outputStream = httpURLConnection2.getOutputStream();
                            try {
                                outputStream.write(byteArray2);
                                outputStream.close();
                            } catch (IOException e11) {
                                iOException2 = e11;
                                outputStream2 = outputStream;
                                httpURLConnection2 = httpURLConnection2;
                                r5 = 0;
                                if (outputStream2 != null) {
                                    outputStream2.close();
                                    break;
                                }
                                if (httpURLConnection2 != null) {
                                    httpURLConnection2.disconnect();
                                }
                                m3737(responseCode2, iOException2, null, r5);
                                return;
                            } catch (Throwable th11) {
                                th = th11;
                                httpURLConnection2 = httpURLConnection2;
                                obj = null;
                                th2 = th;
                                r6 = obj;
                                if (outputStream != null) {
                                    outputStream.close();
                                    break;
                                }
                                if (httpURLConnection2 != null) {
                                    httpURLConnection2.disconnect();
                                }
                                m3737(responseCode2, null, null, r6);
                                throw th2;
                            }
                        } catch (IOException e12) {
                            C3610 c3616 = c5374.f17717;
                            C5371.m9020(c3616);
                            c3616.f12020.m9430(e12, "Failed to gzip post request content");
                            throw e12;
                        }
                    }
                    responseCode2 = httpURLConnection2.getResponseCode();
                    try {
                        try {
                            Map<String, List<String>> headerFields2 = httpURLConnection2.getHeaderFields();
                            try {
                                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                                inputStream2 = httpURLConnection2.getInputStream();
                                try {
                                    byte[] bArr3 = new byte[1024];
                                    while (true) {
                                        int i3 = inputStream2.read(bArr3);
                                        if (i3 <= 0) {
                                            byte[] byteArray3 = byteArrayOutputStream3.toByteArray();
                                            inputStream2.close();
                                            httpURLConnection2.disconnect();
                                            m3737(responseCode2, null, byteArray3, headerFields2);
                                            return;
                                        }
                                        byteArrayOutputStream3.write(bArr3, 0, i3);
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    if (inputStream2 != null) {
                                        inputStream2.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th13) {
                                th = th13;
                                inputStream2 = null;
                            }
                        } catch (IOException e13) {
                            e = e13;
                            str2 = str3;
                            str = str2;
                            iOException2 = e;
                            outputStream2 = null;
                            r5 = str;
                            if (outputStream2 != null) {
                                outputStream2.close();
                                break;
                            }
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            m3737(responseCode2, iOException2, null, r5);
                            return;
                        } catch (Throwable th14) {
                            th = th14;
                            responseCode2 = responseCode2;
                            obj = "Content-Encoding";
                            outputStream = null;
                            httpURLConnection2 = httpURLConnection2;
                            th2 = th;
                            r6 = obj;
                            if (outputStream != null) {
                                outputStream.close();
                                break;
                            }
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            m3737(responseCode2, null, null, r6);
                            throw th2;
                        }
                    } catch (IOException e14) {
                        e = e14;
                        str2 = null;
                        str = str2;
                        iOException2 = e;
                        outputStream2 = null;
                        r5 = str;
                        if (outputStream2 != null) {
                            outputStream2.close();
                            break;
                        }
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        m3737(responseCode2, iOException2, null, r5);
                        return;
                    } catch (Throwable th15) {
                        th = th15;
                        responseCode2 = responseCode2;
                        outputStream = null;
                        obj = null;
                        th2 = th;
                        r6 = obj;
                        if (outputStream != null) {
                            outputStream.close();
                            break;
                        }
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        m3737(responseCode2, null, null, r6);
                        throw th2;
                    }
                } catch (IOException e15) {
                    iOException2 = e15;
                    outputStream2 = null;
                    httpURLConnection2 = null;
                } catch (Throwable th16) {
                    th2 = th16;
                    outputStream = null;
                    httpURLConnection2 = null;
                    r6 = 0;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public void m3737(int i, IOException iOException, byte[] bArr, Map map) {
        C3644 c3644 = ((C5371) ((C2382) this.f6229).f18660).f17733;
        C5371.m9020(c3644);
        c3644.m6515(new RunnableC0682(this, i, iOException, bArr, map));
    }

    public RunnableC1877(C2382 c2382, String str, URL url, byte[] bArr, HashMap map, InterfaceC3665 interfaceC3665) {
        Objects.requireNonNull(c2382);
        this.f6229 = c2382;
        AbstractC0487.m1090(str);
        this.f6230 = url;
        this.f6226 = bArr;
        this.f6228 = interfaceC3665;
        this.f6227 = str;
        this.f6225 = map;
    }
}
