package com.jme3.system.osvr.osvrrendermanageropengl;
import com.jme3.system.osvr.osvrclientkit.OsvrClientKitLibrary;
import com.ochafik.lang.jnaerator.runtime.NativeSize;
import com.ochafik.lang.jnaerator.runtime.NativeSizeByReference;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;
import com.sun.jna.Pointer;
import com.sun.jna.PointerType;
import com.sun.jna.ptr.DoubleByReference;
import com.sun.jna.ptr.FloatByReference;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
/**
 * JNA Wrapper for library <b>osvrRenderManagerOpenGL</b><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class OsvrRenderManagerOpenGLLibrary implements Library {
	public static final String JNA_LIBRARY_NAME = "osvrRenderManager";
	public static final NativeLibrary JNA_NATIVE_LIB = NativeLibrary.getInstance(OsvrRenderManagerOpenGLLibrary.JNA_LIBRARY_NAME);
	static {
		Native.register(OsvrRenderManagerOpenGLLibrary.class, OsvrRenderManagerOpenGLLibrary.JNA_NATIVE_LIB);
	}
	/** enum values */
	public static interface OSVR_OpenStatus {
		public static final int OSVR_OPEN_STATUS_FAILURE = 0;
		public static final int OSVR_OPEN_STATUS_PARTIAL = 1;
		public static final int OSVR_OPEN_STATUS_COMPLETE = 2;
	};
	/**
	 * todo OSVR_RenderTimingInfo<br>
	 * Original signature : <code>OSVR_ReturnCode osvrDestroyRenderManager(OSVR_RenderManager)</code>
	 */
	public static native byte osvrDestroyRenderManager(Pointer renderManager);
	/**
	 * todo Make this actually cache, for now it does not.<br>
	 * Original signature : <code>OSVR_ReturnCode osvrRenderManagerGetNumRenderInfo(OSVR_RenderManager, OSVR_RenderParams, OSVR_RenderInfoCount*)</code>
	 */
	public static native byte osvrRenderManagerGetNumRenderInfo(Pointer renderManager, OSVR_RenderParams.ByValue renderParams, NativeSizeByReference numRenderInfoOut);
	/** Original signature : <code>OSVR_ReturnCode osvrRenderManagerGetDoingOkay(OSVR_RenderManager)</code> */
	public static native byte osvrRenderManagerGetDoingOkay(Pointer renderManager);
	/** Original signature : <code>OSVR_ReturnCode osvrRenderManagerGetDefaultRenderParams(OSVR_RenderParams*)</code> */
	public static native byte osvrRenderManagerGetDefaultRenderParams(OSVR_RenderParams renderParamsOut);
	/**
	 * must be registered before they are presented.<br>
	 * Original signature : <code>OSVR_ReturnCode osvrRenderManagerStartPresentRenderBuffers(OSVR_RenderManagerPresentState*)</code>
	 */
	public static native byte osvrRenderManagerStartPresentRenderBuffers(PointerByReference presentStateOut);
	/**
	 * buffers for a single frame.  This sequence starts with the Start function.<br>
	 * Original signature : <code>OSVR_ReturnCode osvrRenderManagerFinishPresentRenderBuffers(OSVR_RenderManager, OSVR_RenderManagerPresentState, OSVR_RenderParams, OSVR_CBool)</code>
	 */
	public static native byte osvrRenderManagerFinishPresentRenderBuffers(Pointer renderManager, Pointer presentState, OSVR_RenderParams.ByValue renderParams, byte shouldFlipY);
	/**
	 * must be registered before they are presented.<br>
	 * Original signature : <code>OSVR_ReturnCode osvrRenderManagerStartRegisterRenderBuffers(OSVR_RenderManagerRegisterBufferState*)</code>
	 */
	public static native byte osvrRenderManagerStartRegisterRenderBuffers(PointerByReference registerBufferStateOut);
	/**
	 * buffers for a single frame.  This sequence starts with the Start function.<br>
	 * Original signature : <code>OSVR_ReturnCode osvrRenderManagerFinishRegisterRenderBuffers(OSVR_RenderManager, OSVR_RenderManagerRegisterBufferState, OSVR_CBool)</code>
	 */
	public static native byte osvrRenderManagerFinishRegisterRenderBuffers(Pointer renderManager, Pointer registerBufferState, byte appWillNotOverwriteBeforeNewPresent);
	/** Original signature : <code>OSVR_ReturnCode osvrRenderManagerPresentSolidColorf(OSVR_RenderManager, OSVR_RGB_FLOAT)</code> */
	public static native byte osvrRenderManagerPresentSolidColorf(Pointer renderManager, com.jme3.system.osvr.osvrrendermanageropengl.OSVR_RGB.ByValue rgb);
	/**
	 * when you're done.<br>
	 * Original signature : <code>OSVR_ReturnCode osvrRenderManagerGetRenderInfoCollection(OSVR_RenderManager, OSVR_RenderParams, OSVR_RenderInfoCollection*)</code>
	 */
	public static native byte osvrRenderManagerGetRenderInfoCollection(Pointer renderManager, OSVR_RenderParams.ByValue renderParams, PointerByReference renderInfoCollectionOut);
	/**
	 * Releases the OSVR_RenderInfoCollection.<br>
	 * Original signature : <code>OSVR_ReturnCode osvrRenderManagerReleaseRenderInfoCollection(OSVR_RenderInfoCollection)</code>
	 */
	public static native byte osvrRenderManagerReleaseRenderInfoCollection(Pointer renderInfoCollection);
	/**
	 * Get the size of the OSVR_RenderInfoCollection.<br>
	 * Original signature : <code>OSVR_ReturnCode osvrRenderManagerGetNumRenderInfoInCollection(OSVR_RenderInfoCollection, OSVR_RenderInfoCount*)</code>
	 */
	public static native byte osvrRenderManagerGetNumRenderInfoInCollection(Pointer renderInfoCollection, NativeSizeByReference countOut);
	/**
	 * @return True on success, false on failure (null pointer).<br>
	 * Original signature : <code>OSVR_ReturnCode OSVR_Projection_to_OpenGL(double*, OSVR_ProjectionMatrix)</code><br>
	 * @deprecated use the safer methods {@link #OSVR_Projection_to_OpenGL(java.nio.DoubleBuffer, com.jme3.system.osvr.osvrrendermanageropengl.OSVR_ProjectionMatrix.ByValue)} and {@link #OSVR_Projection_to_OpenGL(com.sun.jna.ptr.DoubleByReference, com.jme3.system.osvr.osvrrendermanageropengl.OSVR_ProjectionMatrix.ByValue)} instead
	 */
	@Deprecated 
	public static native byte OSVR_Projection_to_OpenGL(DoubleByReference OpenGL_out, com.jme3.system.osvr.osvrrendermanageropengl.OSVR_ProjectionMatrix.ByValue projection_in);
	/**
	 * @return True on success, false on failure (null pointer).<br>
	 * Original signature : <code>OSVR_ReturnCode OSVR_Projection_to_OpenGL(double*, OSVR_ProjectionMatrix)</code>
	 */
	public static native byte OSVR_Projection_to_OpenGL(DoubleBuffer OpenGL_out, com.jme3.system.osvr.osvrrendermanageropengl.OSVR_ProjectionMatrix.ByValue projection_in);
	/**
	 * @return True on success, false on failure (null pointer).<br>
	 * Original signature : <code>OSVR_ReturnCode OSVR_Projection_to_D3D(float[16], OSVR_ProjectionMatrix)</code><br>
	 * @deprecated use the safer methods {@link #OSVR_Projection_to_D3D(java.nio.FloatBuffer, com.jme3.system.osvr.osvrrendermanageropengl.OSVR_ProjectionMatrix.ByValue)} and {@link #OSVR_Projection_to_D3D(com.sun.jna.ptr.FloatByReference, com.jme3.system.osvr.osvrrendermanageropengl.OSVR_ProjectionMatrix.ByValue)} instead
	 */
	@Deprecated 
	public static native byte OSVR_Projection_to_D3D(FloatByReference D3D_out, com.jme3.system.osvr.osvrrendermanageropengl.OSVR_ProjectionMatrix.ByValue projection_in);
	/**
	 * @return True on success, false on failure (null pointer).<br>
	 * Original signature : <code>OSVR_ReturnCode OSVR_Projection_to_D3D(float[16], OSVR_ProjectionMatrix)</code>
	 */
	public static native byte OSVR_Projection_to_D3D(FloatBuffer D3D_out, com.jme3.system.osvr.osvrrendermanageropengl.OSVR_ProjectionMatrix.ByValue projection_in);
	/**
	 * @return True on success, false on failure (null pointer).<br>
	 * Original signature : <code>OSVR_ReturnCode OSVR_Projection_to_Unreal(float[16], OSVR_ProjectionMatrix)</code><br>
	 * @deprecated use the safer methods {@link #OSVR_Projection_to_Unreal(java.nio.FloatBuffer, com.jme3.system.osvr.osvrrendermanageropengl.OSVR_ProjectionMatrix.ByValue)} and {@link #OSVR_Projection_to_Unreal(com.sun.jna.ptr.FloatByReference, com.jme3.system.osvr.osvrrendermanageropengl.OSVR_ProjectionMatrix.ByValue)} instead
	 */
	@Deprecated 
	public static native byte OSVR_Projection_to_Unreal(FloatByReference Unreal_out, com.jme3.system.osvr.osvrrendermanageropengl.OSVR_ProjectionMatrix.ByValue projection_in);
	/**
	 * @return True on success, false on failure (null pointer).<br>
	 * Original signature : <code>OSVR_ReturnCode OSVR_Projection_to_Unreal(float[16], OSVR_ProjectionMatrix)</code>
	 */
	public static native byte OSVR_Projection_to_Unreal(FloatBuffer Unreal_out, com.jme3.system.osvr.osvrrendermanageropengl.OSVR_ProjectionMatrix.ByValue projection_in);
	/**
	 * Original signature : <code>OSVR_ReturnCode osvrCreateRenderManagerOpenGL(OSVR_ClientContext, const char[], OSVR_GraphicsLibraryOpenGL, OSVR_RenderManager*, OSVR_RenderManagerOpenGL*)</code><br>
	 * @deprecated use the safer method
         * {@link #osvrCreateRenderManagerOpenGL(com.jme3.system.osvr.osvrclientkit.OsvrClientKitLibrary.OSVR_ClientContext, byte[], com.jme3.system.osvr.osvrrendermanageropengl.OSVR_GraphicsLibraryOpenGL.ByValue, com.sun.jna.ptr.PointerByReference, com.sun.jna.ptr.PointerByReference)}
         * instead
	 */
	@Deprecated 
	public static native byte osvrCreateRenderManagerOpenGL(Pointer clientContext, Pointer graphicsLibraryName, com.jme3.system.osvr.osvrrendermanageropengl.OSVR_GraphicsLibraryOpenGL.ByValue graphicsLibrary, PointerByReference renderManagerOut, PointerByReference renderManagerOpenGLOut);
	/** Original signature : <code>OSVR_ReturnCode osvrCreateRenderManagerOpenGL(OSVR_ClientContext, const char[], OSVR_GraphicsLibraryOpenGL, OSVR_RenderManager*, OSVR_RenderManagerOpenGL*)</code> */
	public static native byte osvrCreateRenderManagerOpenGL(OsvrClientKitLibrary.OSVR_ClientContext clientContext, byte graphicsLibraryName[], com.jme3.system.osvr.osvrrendermanageropengl.OSVR_GraphicsLibraryOpenGL.ByValue graphicsLibrary, PointerByReference renderManagerOut, PointerByReference renderManagerOpenGLOut);
	/** Original signature : <code>OSVR_ReturnCode osvrRenderManagerGetRenderInfoOpenGL(OSVR_RenderManagerOpenGL, OSVR_RenderInfoCount, OSVR_RenderParams, OSVR_RenderInfoOpenGL*)</code> */
	public static native byte osvrRenderManagerGetRenderInfoOpenGL(Pointer renderManager, NativeSize renderInfoIndex, OSVR_RenderParams.ByValue renderParams, OSVR_RenderInfoOpenGL renderInfoOut);
	/** Original signature : <code>OSVR_ReturnCode osvrRenderManagerOpenDisplayOpenGL(OSVR_RenderManagerOpenGL, OSVR_OpenResultsOpenGL*)</code> */
	public static native byte osvrRenderManagerOpenDisplayOpenGL(Pointer renderManager, OSVR_OpenResultsOpenGL openResultsOut);
	/** Original signature : <code>OSVR_ReturnCode osvrRenderManagerPresentRenderBufferOpenGL(OSVR_RenderManagerPresentState, OSVR_RenderBufferOpenGL, OSVR_RenderInfoOpenGL, OSVR_ViewportDescription)</code> */
	public static native byte osvrRenderManagerPresentRenderBufferOpenGL(Pointer presentState, com.jme3.system.osvr.osvrrendermanageropengl.OSVR_RenderBufferOpenGL.ByValue buffer, OSVR_RenderInfoOpenGL.ByValue renderInfoUsed, com.jme3.system.osvr.osvrrendermanageropengl.OSVR_ViewportDescription.ByValue normalizedCroppingViewport);
	/** Original signature : <code>OSVR_ReturnCode osvrRenderManagerRegisterRenderBufferOpenGL(OSVR_RenderManagerRegisterBufferState, OSVR_RenderBufferOpenGL)</code> */
	public static native byte osvrRenderManagerRegisterRenderBufferOpenGL(Pointer registerBufferState, com.jme3.system.osvr.osvrrendermanageropengl.OSVR_RenderBufferOpenGL.ByValue renderBuffer);
	/**
	 * Gets a given OSVR_RenderInfoOpenGL from an OSVR_RenderInfoCollection.<br>
	 * Original signature : <code>OSVR_ReturnCode osvrRenderManagerGetRenderInfoFromCollectionOpenGL(OSVR_RenderInfoCollection, OSVR_RenderInfoCount, OSVR_RenderInfoOpenGL*)</code>
	 */
	public static native byte osvrRenderManagerGetRenderInfoFromCollectionOpenGL(Pointer renderInfoCollection, NativeSize index, OSVR_RenderInfoOpenGL renderInfoOut);
	/**
	 * Original signature : <code>OSVR_ReturnCode osvrRenderManagerCreateColorBufferOpenGL(GLsizei, GLsizei, GLenum, GLuint*)</code><br>
	 * @deprecated use the safer methods {@link #osvrRenderManagerCreateColorBufferOpenGL(int, int, int, java.nio.IntBuffer)} and {@link #osvrRenderManagerCreateColorBufferOpenGL(int, int, int, com.sun.jna.ptr.IntByReference)} instead
	 */
	@Deprecated 
	public static native byte osvrRenderManagerCreateColorBufferOpenGL(int width, int height, int format, IntByReference colorBufferNameOut);
	/** Original signature : <code>OSVR_ReturnCode osvrRenderManagerCreateColorBufferOpenGL(GLsizei, GLsizei, GLenum, GLuint*)</code> */
	public static native byte osvrRenderManagerCreateColorBufferOpenGL(int width, int height, int format, IntBuffer colorBufferNameOut);
	/**
	 * Original signature : <code>OSVR_ReturnCode osvrRenderManagerCreateDepthBufferOpenGL(GLsizei, GLsizei, GLuint*)</code><br>
	 * @deprecated use the safer methods {@link #osvrRenderManagerCreateDepthBufferOpenGL(int, int, java.nio.IntBuffer)} and {@link #osvrRenderManagerCreateDepthBufferOpenGL(int, int, com.sun.jna.ptr.IntByReference)} instead
	 */
	@Deprecated 
	public static native byte osvrRenderManagerCreateDepthBufferOpenGL(int width, int height, IntByReference depthBufferNameOut);
	/** Original signature : <code>OSVR_ReturnCode osvrRenderManagerCreateDepthBufferOpenGL(GLsizei, GLsizei, GLuint*)</code> */
	public static native byte osvrRenderManagerCreateDepthBufferOpenGL(int width, int height, IntBuffer depthBufferNameOut);
	public static class OSVR_ClientContext extends PointerType {
		public OSVR_ClientContext(Pointer address) {
			super(address);
		}
		public OSVR_ClientContext() {
			super();
		}
	};
}
