package me.lixko.csgoexternals.util;

public class Studio {

	public static int STUDIO_VERSION = 48;

	public static int MAXSTUDIOTRIANGLES = 65536;
	public static int MAXSTUDIOVERTS = 65536;
	public static int MAXSTUDIOFLEXVERTS = 10000;

	public static int MAXSTUDIOSKINS = 32; // total textures
	public static int MAXSTUDIOBONES = 128; // total bones actually used
	public static int MAXSTUDIOFLEXDESC = 1024; // maximum number of low level flexes (actual morph targets)
	public static int MAXSTUDIOFLEXCTRL = 96; // maximum number of flexcontrollers (input sliders)
	public static int MAXSTUDIOPOSEPARAM = 24;
	public static int MAXSTUDIOBONECTRLS = 4;
	public static int MAXSTUDIOANIMBLOCKS = 256;

	public static int MAXSTUDIOBONEBITS = 7; // NOTE: MUST MATCH MAXSTUDIOBONES

	// NOTE!!! : Changing this number also changes the vtx file format!!!!!
	public static int MAX_NUM_BONES_PER_VERT = 3;

	// Adrian - Remove this when we completely phase out the old event system.
	public static int NEW_EVENT_STYLE = (1 << 10);

	public static int STUDIO_PROC_AXISINTERP = 1;
	public static int STUDIO_PROC_QUATINTERP = 2;
	public static int STUDIO_PROC_AIMATBONE = 3;
	public static int STUDIO_PROC_AIMATATTACH = 4;
	public static int STUDIO_PROC_JIGGLE = 5;

	public static int JIGGLE_IS_FLEXIBLE = 0x01;
	public static int JIGGLE_IS_RIGID = 0x02;
	public static int JIGGLE_HAS_YAW_CONSTRAINT = 0x04;
	public static int JIGGLE_HAS_PITCH_CONSTRAINT = 0x08;
	public static int JIGGLE_HAS_ANGLE_CONSTRAINT = 0x10;
	public static int JIGGLE_HAS_LENGTH_CONSTRAINT = 0x20;
	public static int JIGGLE_HAS_BASE_SPRING = 0x40;
	public static int JIGGLE_IS_BOING = 0x80; // simple squash and stretch sinusoid "boing"

	public static int BONE_CALCULATE_MASK = 0x1F;
	public static int BONE_PHYSICALLY_SIMULATED = 0x01; // bone is physically simulated when physics are active
	public static int BONE_PHYSICS_PROCEDURAL = 0x02; // procedural when physics is active
	public static int BONE_ALWAYS_PROCEDURAL = 0x04; // bone is always procedurally animated
	public static int BONE_SCREEN_ALIGN_SPHERE = 0x08; // bone aligns to the screen, not constrained in motion.
	public static int BONE_SCREEN_ALIGN_CYLINDER = 0x10; // bone aligns to the screen, constrained by it's own axis.

	public static int BONE_USED_MASK = 0x0007FF00;
	public static int BONE_USED_BY_ANYTHING = 0x0007FF00;
	public static int BONE_USED_BY_HITBOX = 0x00000100; // bone (or child) is used by a hit box
	public static int BONE_USED_BY_ATTACHMENT = 0x00000200; // bone (or child) is used by an attachment point
	public static int BONE_USED_BY_VERTEX_MASK = 0x0003FC00;
	public static int BONE_USED_BY_VERTEX_LOD0 = 0x00000400; // bone (or child) is used by the toplevel model via skinned vertex
	public static int BONE_USED_BY_VERTEX_LOD1 = 0x00000800;
	public static int BONE_USED_BY_VERTEX_LOD2 = 0x00001000;
	public static int BONE_USED_BY_VERTEX_LOD3 = 0x00002000;
	public static int BONE_USED_BY_VERTEX_LOD4 = 0x00004000;
	public static int BONE_USED_BY_VERTEX_LOD5 = 0x00008000;
	public static int BONE_USED_BY_VERTEX_LOD6 = 0x00010000;
	public static int BONE_USED_BY_VERTEX_LOD7 = 0x00020000;
	public static int BONE_USED_BY_BONE_MERGE = 0x00040000; // bone is available for bone merge to occur against it

	public static int MAX_NUM_LODS = 8;

	public static int BONE_TYPE_MASK = 0x00F00000;
	public static int BONE_FIXED_ALIGNMENT = 0x00100000; // bone can't spin 360 degrees, all interpolation is normalized around a fixed orientation

	public static int BONE_HAS_SAVEFRAME_POS = 0x00200000; // Vector48
	public static int BONE_HAS_SAVEFRAME_ROT = 0x00400000; // Quaternion64

	public static int ATTACHMENT_FLAG_WORLD_ALIGN = 0x10000;

	public static int IK_SELF = 1;
	public static int IK_WORLD = 2;
	public static int IK_GROUND = 3;
	public static int IK_RELEASE = 4;
	public static int IK_ATTACHMENT = 5;
	public static int IK_UNLATCH = 6;

	public static int STUDIO_ANIM_RAWPOS = 0x01;// Vector48
	public static int STUDIO_ANIM_RAWROT = 0x02;// Quaternion48
	public static int STUDIO_ANIM_ANIMPOS = 0x04;// mstudioanim_valueptr_t
	public static int STUDIO_ANIM_ANIMROT = 0x08;// mstudioanim_valueptr_t
	public static int STUDIO_ANIM_DELTA = 0x10;
	public static int STUDIO_ANIM_RAWROT2 = 0x20;// Quaternion64

	// This flag is set if no hitbox information was specified
	public static int STUDIOHDR_FLAGS_AUTOGENERATED_HITBOX = (1 << 0);

	// NOTE: This flag is set at loadtime, not mdl build time so that we don't have to rebuild
	// models when we change materials.
	public static int STUDIOHDR_FLAGS_USES_ENV_CUBEMAP = (1 << 1);

	// Use this when there are translucent parts to the model but we're not going to sort it
	public static int STUDIOHDR_FLAGS_FORCE_OPAQUE = (1 << 2);

	// Use this when we want to render the opaque parts during the opaque pass
	// and the translucent parts during the translucent pass
	public static int STUDIOHDR_FLAGS_TRANSLUCENT_TWOPASS = (1 << 3);

	// This is set any time the .qc files has $staticprop in it
	// Means there's no bones and no transforms
	public static int STUDIOHDR_FLAGS_STATIC_PROP = (1 << 4);

	// NOTE: This flag is set at loadtime, not mdl build time so that we don't have to rebuild
	// models when we change materials.
	public static int STUDIOHDR_FLAGS_USES_FB_TEXTURE = (1 << 5);

	// This flag is set by studiomdl.exe if a separate "$shadowlod" entry was present
	// for the .mdl (the shadow lod is the last entry in the lod list if present)
	public static int STUDIOHDR_FLAGS_HASSHADOWLOD = (1 << 6);

	// NOTE: This flag is set at loadtime, not mdl build time so that we don't have to rebuild
	// models when we change materials.
	public static int STUDIOHDR_FLAGS_USES_BUMPMAPPING = (1 << 7);

	// NOTE: This flag is set when we should use the actual materials on the shadow LOD
	// instead of overriding them with the default one (necessary for translucent shadows)
	public static int STUDIOHDR_FLAGS_USE_SHADOWLOD_MATERIALS = (1 << 8);

	// NOTE: This flag is set when we should use the actual materials on the shadow LOD
	// instead of overriding them with the default one (necessary for translucent shadows)
	public static int STUDIOHDR_FLAGS_OBSOLETE = (1 << 9);

	public static int STUDIOHDR_FLAGS_UNUSED = (1 << 10);

	// NOTE: This flag is set at mdl build time
	public static int STUDIOHDR_FLAGS_NO_FORCED_FADE = (1 << 11);

	// NOTE: The npc will lengthen the viseme check to always include two phonemes
	public static int STUDIOHDR_FLAGS_FORCE_PHONEME_CROSSFADE = (1 << 12);

	// This flag is set when the .qc has $constantdirectionallight in it
	// If set, we use constantdirectionallightdot to calculate light intensity
	// rather than the normal directional dot product
	// only valid if STUDIOHDR_FLAGS_STATIC_PROP is also set
	public static int STUDIOHDR_FLAGS_CONSTANT_DIRECTIONAL_LIGHT_DOT = (1 << 13);

	// Flag to mark delta flexes as already converted from disk format to memory format
	public static int STUDIOHDR_FLAGS_FLEXES_CONVERTED = (1 << 14);

	// Indicates the studiomdl was built in preview mode
	public static int STUDIOHDR_FLAGS_BUILT_IN_PREVIEW_MODE = (1 << 15);

	// Ambient boost (runtime flag)
	public static int STUDIOHDR_FLAGS_AMBIENT_BOOST = (1 << 16);

	// Don't cast shadows from this model (useful on first-person models)
	public static int STUDIOHDR_FLAGS_DO_NOT_CAST_SHADOWS = (1 << 17);

	// alpha textures should cast shadows in vrad on this model (ONLY prop_static!)
	public static int STUDIOHDR_FLAGS_CAST_TEXTURE_SHADOWS = (1 << 18);

	// flagged on load to indicate no animation events on this model
	public static int STUDIOHDR_FLAGS_VERT_ANIM_FIXED_POINT_SCALE = (1 << 21);

	public static int STUDIO_CONST = 1; // get float
	public static int STUDIO_FETCH1 = 2; // get Flexcontroller value
	public static int STUDIO_FETCH2 = 3; // get flex weight
	public static int STUDIO_ADD = 4;
	public static int STUDIO_SUB = 5;
	public static int STUDIO_MUL = 6;
	public static int STUDIO_DIV = 7;
	public static int STUDIO_NEG = 8; // not implemented
	public static int STUDIO_EXP = 9; // not implemented
	public static int STUDIO_OPEN = 10; // only used in token parsing
	public static int STUDIO_CLOSE = 11;
	public static int STUDIO_COMMA = 12; // only used in token parsing
	public static int STUDIO_MAX = 13;
	public static int STUDIO_MIN = 14;
	public static int STUDIO_2WAY_0 = 15; // Fetch a value from a 2 Way slider for the 1st value RemapVal( 0.0, 0.5, 0.0, 1.0 )
	public static int STUDIO_2WAY_1 = 16; // Fetch a value from a 2 Way slider for the 2nd value RemapVal( 0.5, 1.0, 0.0, 1.0 )
	public static int STUDIO_NWAY = 17; // Fetch a value from a 2 Way slider for the 2nd value RemapVal( 0.5, 1.0, 0.0, 1.0 )
	public static int STUDIO_COMBO = 18; // Perform a combo operation (essentially multiply the last N values on the stack)
	public static int STUDIO_DOMINATE = 19; // Performs a combination domination operation
	public static int STUDIO_DME_LOWER_EYELID = 20; //
	public static int STUDIO_DME_UPPER_EYELID = 21; //

	// motion flags
	public static int STUDIO_X = 0x00000001;
	public static int STUDIO_Y = 0x00000002;
	public static int STUDIO_Z = 0x00000004;
	public static int STUDIO_XR = 0x00000008;
	public static int STUDIO_YR = 0x00000010;
	public static int STUDIO_ZR = 0x00000020;

	public static int STUDIO_LX = 0x00000040;
	public static int STUDIO_LY = 0x00000080;
	public static int STUDIO_LZ = 0x00000100;
	public static int STUDIO_LXR = 0x00000200;
	public static int STUDIO_LYR = 0x00000400;
	public static int STUDIO_LZR = 0x00000800;

	public static int STUDIO_LINEAR = 0x00001000;

	public static int STUDIO_TYPES = 0x0003FFFF;
	public static int STUDIO_RLOOP = 0x00040000; // controller that wraps shortest distance

	// sequence and autolayer flags
	public static int STUDIO_LOOPING = 0x0001; // ending frame should be the same as the starting frame
	public static int STUDIO_SNAP = 0x0002; // do not interpolate between previous animation and this one
	public static int STUDIO_DELTA = 0x0004; // this sequence "adds" to the base sequences, not slerp blends
	public static int STUDIO_AUTOPLAY = 0x0008; // temporary flag that forces the sequence to always play
	public static int STUDIO_POST = 0x0010; //
	public static int STUDIO_ALLZEROS = 0x0020; // this animation/sequence has no real animation data
	// 0x0040
	public static int STUDIO_CYCLEPOSE = 0x0080; // cycle index is taken from a pose parameter index
	public static int STUDIO_REALTIME = 0x0100; // cycle index is taken from a real-time clock, not the animations cycle index
	public static int STUDIO_LOCAL = 0x0200; // sequence has a local context sequence
	public static int STUDIO_HIDDEN = 0x0400; // don't show in default selection views
	public static int STUDIO_OVERRIDE = 0x0800; // a forward declared sequence (empty)
	public static int STUDIO_ACTIVITY = 0x1000; // Has been updated at runtime to activity index
	public static int STUDIO_EVENT = 0x2000; // Has been updated at runtime to event index
	public static int STUDIO_WORLD = 0x4000; // sequence blends in worldspace
	// autolayer flags
	// 0x0001
	// 0x0002
	// 0x0004
	// 0x0008
	public static int STUDIO_AL_POST = 0x0010; //
	// 0x0020
	public static int STUDIO_AL_SPLINE = 0x0040; // convert layer ramp in/out curve is a spline instead of linear
	public static int STUDIO_AL_XFADE = 0x0080; // pre-bias the ramp curve to compense for a non-1 weight, assuming a second layer is also going to accumulate
	// 0x0100
	public static int STUDIO_AL_NOBLEND = 0x0200; // animation always blends at 1.0 (ignores weight)
	// 0x0400
	// 0x0800
	public static int STUDIO_AL_LOCAL = 0x1000; // layer is a local context sequence
	// 0x2000
	public static int STUDIO_AL_POSE = 0x4000; // layer blends using a pose parameter instead of parent cycle

}